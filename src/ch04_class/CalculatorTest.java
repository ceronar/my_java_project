package ch04_class;

public class CalculatorTest {
    public static void main(String[] args) {
        int a = 5, b = 7, c = 1, d = 2, e = 3;
        double x = 3.5, y = 2.1;
        String str1 = "Hello", str2 = "World";
        int[] arr = {1,2,3,4,5,6,7,8};
        Calculator cal = new Calculator();
        System.out.println(a+" + "+b+" = "+cal.add(a,b));
        System.out.println(x+" + "+y+" = "+cal.add(x,y));
        System.out.println(c+" + "+d+" + "+e+" = "+cal.add(c,d,e));
        System.out.println(str1+" + "+str2+" = "+cal.add(str1,str2));
        System.out.println("arr 합산 : " + cal.add(arr));
    }
}
