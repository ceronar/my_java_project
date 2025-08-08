package ch99_My_Project.GameCharacter;

public class GameMain01 {
    public static void main(String[] args) {
        GameCharacter01 warrior = new GameCharacter01("IronFist", 20, 1500, 200, 120.5, 80.0, "Warrior");
        GameCharacter01 mage = new GameCharacter01("Mystra", 18, 800, 1200, 200.0, 40.0, "Mage");
        GameCharacter01 archer = new GameCharacter01("HawkEye", 22, 1000, 500, 150.0, 60.0, "Archer");

        /*
        warrior.attack(archer);
        mage.heal(200);
        archer.levelUp();

        archer.showInfo();
        mage.showInfo();
         */

        System.out.println("=== 전투 시작 ===");

        for (int turn = 1; warrior.getHealth() > 0 && mage.getHealth() > 0; turn++) {
            System.out.println("\n--- 턴 " + turn + " ---");

            if (turn % 2 == 1) {
                // 홀수 턴: Warrior 차례
                if (warrior.skillCooldown == 0) warrior.useSkill(mage); // 조건에 따라 스킬 사용
                else warrior.attack(mage);
            } else {
                // 짝수 턴: Mage 차례
                if (mage.skillCooldown == 0 && mage.getMana() >= 300) mage.useSkill(warrior);
                else mage.attack(warrior);
            }

            // 턴 종료 시 쿨타임 감소
            warrior.endTurn();
            mage.endTurn();

            // 체력 출력
            System.out.println(warrior.getNickName() + " HP: " + warrior.getHealth() + ", " + mage.getNickName() + "HP: " + mage.getHealth());
        }

        System.out.println("\n=== 전투 종료 ===");
        if (warrior.getHealth() > 0) System.out.println(warrior.getNickName() + " 승리!");
        else System.out.println(mage.getNickName() + " 승리!");
    }
}
