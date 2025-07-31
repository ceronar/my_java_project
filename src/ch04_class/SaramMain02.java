package ch04_class;

public class SaramMain02 {
    public static void main(String[] args) {
        System.out.println(Saram02.nationality);

        Saram02 yusin = new Saram02();
        yusin.name = "김유신";
        yusin.height = 172.5;
        yusin.weight = 65.8;
        yusin.hobby = "축구";
        yusin.blood = "A";

        Saram02 soon = new Saram02();
        soon.name = "유관순";
        soon.height = 165.5;
        soon.weight = 52.3;
        soon.hobby = "야구";
        soon.blood = "B";

        yusin.nationality = "한국";

        System.out.println(soon.nationality);

        System.out.println(Saram02.nationality);

        yusin.display();
        soon.display();
    }
}
