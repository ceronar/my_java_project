package ch04_class;

public class GameCharacter01 {
    private String nickName;
    private int level;
    private int health;
    private int mana;
    private double attackPower;
    private double defensePower;
    private String job;

    int skillCooldown = 0; // 스킬 쿨타임 변수

    public GameCharacter01() {
    }

    public GameCharacter01(String nickName, int level, int health, int mana, double attackPower, double defensePower, String job) {
        this.nickName = nickName;
        this.level = level;
        this.health = health;
        this.mana = mana;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.job = job;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public double getAttackPower() {
        return attackPower;
    }
    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }
    public double getDefensePower() {
        return defensePower;
    }
    public void setDefensePower(double defensePower) {
        this.defensePower = defensePower;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public void attack(GameCharacter01 op) {
        int demage = (int)(attackPower - op.defensePower);
        if(demage > 0) {
            op.health -= (int) demage;
            System.out.println(nickName + "가 " + op.nickName + "을 공격");
            System.out.println(demage + " 데미지를 입혔습니다.");
        } else {
            System.out.println(nickName + "가 " + op.nickName + "을 공격");
            System.out.println("방어했습니다.");
        }

    }

    public int heal(int h) {
        health += h;
        System.out.println(nickName + "가 " + h + "만큼 회복 했습니다. ");
        System.out.println("현재 체력 : " + health);
        return health;
    }

    public int levelUp() {
        level++;
        health += 100;
        mana += 50;
        attackPower += 10;
        defensePower += 10;
        System.out.println(nickName + " 레벨업!");
        System.out.println("현재 레벨 : " + level);
        return level;
    }

    public void useSkill(GameCharacter01 target) {
        if (skillCooldown > 0) {
            System.out.println(nickName + "의 스킬은 현재 쿨타임입니다! (" + skillCooldown + "턴 남음)");
            return;
        }
        switch (job) {
            case "Warrior":
                int skillDamage = (int)(attackPower * 1.5 - target.defensePower);
                target.health -= Math.max(skillDamage, 0);
                System.out.println(nickName + "가 'Power Slash' 사용! " + target.nickName + "에게 " + Math.max(skillDamage, 0) + " 데미지!");
                skillCooldown = 2; // 2턴 쿨타임
                break;
            case "Mage":
                if (mana >= 300) {
                    int magicDamage = (int)(attackPower * 1.8);
                    target.health -= magicDamage;
                    mana -= 300;
                    System.out.println(nickName + "가 'Fireball' 사용! " + target.nickName + "에게 " + magicDamage + " 마법 피해!");
                    skillCooldown = 3;
                } else {
                    System.out.println(nickName + "의 마나가 부족해 스킬 실패!");
                }
                break;
            case "Archer":
                int fixedDamage = 120;
                target.health -= fixedDamage;
                System.out.println(nickName + "가 'Piercing Shot' 사용! 방어 무시 데미지 " + fixedDamage + "!");
                skillCooldown = 2;
                break;
            default:
                System.out.println(nickName + "는 스킬이 없습니다.");
        }
    }

    public void endTurn() {
        if (skillCooldown > 0) skillCooldown--;
    }

    public void showInfo() {
        System.out.println("-----정보-----");
        System.out.println("닉네임 : " + nickName);
        System.out.println("레벨 : " + level);
        System.out.println("현재 체력 : " + health);
        System.out.println("현재 마나 : " + mana);
        System.out.println("공격력 : " + attackPower);
        System.out.println("방어력 : " + defensePower);
        System.out.println("직업 : " + job);
    }
}
