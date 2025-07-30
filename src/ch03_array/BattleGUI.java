package ch03_array;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BattleGUI extends JFrame {
    ArrayList<GameCharacter> party = new ArrayList<>();
    ArrayList<GameCharacter> enemies = new ArrayList<>();

    JTextArea logArea = new JTextArea(10, 40);
    JPanel enemyPanel = new JPanel();
    JLabel[] partyStatusLabels;
    int currentTurn = 0;

    public BattleGUI() {
        setTitle("RPG 전투 시스템");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 파티 구성
        party.add(new GameCharacter("IronFist", 20, 1500, 200, 120.5, 50.0, "Warrior"));
        party.add(new GameCharacter("Mystra", 18, 1000, 300, 140.0, 30.0, "Mage"));
        party.add(new GameCharacter("HawkEye", 22, 1200, 250, 130.0, 40.0, "Archer"));

        // 적 구성
        enemies.add(new GameCharacter("Goblin", 10, 500, 0, 80.0, 20.0, "Monster"));
        enemies.add(new GameCharacter("Orc", 12, 800, 0, 100.0, 30.0, "Monster"));
        enemies.add(new GameCharacter("Dark Mage", 15, 600, 200, 150.0, 25.0, "Monster"));

        // 상단 - 상태
        JPanel partyStatusPanel = new JPanel(new GridLayout(party.size(), 1));
        partyStatusLabels = new JLabel[party.size()];
        for (int i = 0; i < party.size(); i++) {
            partyStatusLabels[i] = new JLabel();
            partyStatusPanel.add(partyStatusLabels[i]);
        }

        add(partyStatusPanel, BorderLayout.NORTH);

        // 중앙 - 적 목록
        enemyPanel.setLayout(new GridLayout(1, enemies.size()));
        refreshEnemyButtons();
        add(enemyPanel, BorderLayout.CENTER);

        // 하단 - 로그 및 행동
        logArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(logArea);

        JPanel actionPanel = new JPanel();
        JButton attackBtn = new JButton("공격");
        JButton skillBtn = new JButton("스킬");

        attackBtn.addActionListener(e -> chooseTarget("attack"));
        skillBtn.addActionListener(e -> chooseTarget("skill"));

        actionPanel.add(attackBtn);
        actionPanel.add(skillBtn);

        JPanel bottom = new JPanel(new BorderLayout());
        bottom.add(scrollPane, BorderLayout.CENTER);
        bottom.add(actionPanel, BorderLayout.SOUTH);

        add(bottom, BorderLayout.SOUTH);

        refreshUI();
        setVisible(true);
    }

    void chooseTarget(String actionType) {
        if (currentTurn >= party.size()) return;

        JOptionPane.showMessageDialog(this, "공격할 적을 선택하세요");

        for (Component c : enemyPanel.getComponents()) {
            c.setEnabled(true);
            ((JButton) c).putClientProperty("actionType", actionType);
        }
    }

    void refreshEnemyButtons() {
        enemyPanel.removeAll();
        for (int i = 0; i < enemies.size(); i++) {
            GameCharacter enemy = enemies.get(i);
            JButton btn = new JButton();
            btn.setPreferredSize(new Dimension(150, 60));
            updateEnemyButtonText(btn, enemy);

            int idx = i;
            btn.addActionListener(e -> {
                String action = (String)((JButton) e.getSource()).getClientProperty("actionType");
                GameCharacter actor = party.get(currentTurn);
                GameCharacter target = enemies.get(idx);

                if (action.equals("attack")) {
                    actor.attack(target);
                    logArea.append(actor.nickName + " → " + target.nickName + " 공격!\n");
                } else {
                    actor.useSkill(target);
                    logArea.append(actor.nickName + " → " + target.nickName + " 스킬 사용!\n");
                }

                if (target.health <= 0) {
                    logArea.append(target.nickName + " 처치됨!\n");
                    enemies.remove(idx);
                }

                actor.endTurn();
                currentTurn++;

                if (currentTurn >= party.size()) {
                    currentTurn = 0;
                    logArea.append("\n--- 다음 턴 ---\n");
                }

                refreshUI(); // 🎯 모든 상태 갱신
            });

            btn.setEnabled(false);
            enemyPanel.add(btn);
        }
        enemyPanel.revalidate();
        enemyPanel.repaint();
    }

    void updateEnemyButtonText(JButton button, GameCharacter enemy) {
        button.setText("<html>" +
                enemy.nickName + "<br>HP: " + enemy.health + "</html>");
    }


    void refreshUI() {
        for (int i = 0; i < party.size(); i++) {
            GameCharacter c = party.get(i);
            partyStatusLabels[i].setText(
                    String.format("%s (Lv.%d) HP:%d MP:%d 쿨타임:%d",
                            c.nickName, c.level, c.health, c.mana, c.skillCooldown)
            );
        }
        refreshEnemyButtons(); // 💡 적 체력도 새로 갱신
    }

    public static void main(String[] args) {
        new BattleGUI();
    }

    // 내부 클래스: GameCharacter (전투용)
    class GameCharacter {
        String nickName;
        int level;
        int health;
        int mana;
        double attackPower;
        double defensePower;
        String job;
        int skillCooldown = 0;

        public GameCharacter(String nickName, int level, int health, int mana,
                             double attackPower, double defensePower, String job) {
            this.nickName = nickName;
            this.level = level;
            this.health = health;
            this.mana = mana;
            this.attackPower = attackPower;
            this.defensePower = defensePower;
            this.job = job;
        }

        public void attack(GameCharacter target) {
            int damage = (int) Math.max(this.attackPower - target.defensePower, 0);
            target.health -= damage;
        }

        public void useSkill(GameCharacter target) {
            if (skillCooldown > 0) {
                logArea.append(nickName + "의 스킬은 쿨타임 중! (" + skillCooldown + "턴 남음)\n");
                return;
            }

            switch (job) {
                case "Warrior":
                    int skillDamage = (int)(attackPower * 1.5 - target.defensePower);
                    target.health -= Math.max(skillDamage, 0);
                    skillCooldown = 2;
                    break;
                case "Mage":
                    if (mana >= 100) {
                        int magicDamage = (int)(attackPower * 1.8);
                        target.health -= magicDamage;
                        mana -= 100;
                        skillCooldown = 3;
                    } else {
                        logArea.append(nickName + "의 마나 부족! 스킬 실패!\n");
                    }
                    break;
                case "Archer":
                    int fixedDamage = 120;
                    target.health -= fixedDamage;
                    skillCooldown = 2;
                    break;
                default:
                    break;
            }
        }

        public void endTurn() {
            if (skillCooldown > 0) skillCooldown--;
        }
    }
}

