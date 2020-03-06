package day07.OOP.innerClass.innerClass;

public class Demo01 {
    public static void main(String[] args) {
        Test t = new Test();
        t.Method();

        System.out.println("------------------");

        Test.InnerClass ti = new Test().new InnerClass();
        System.out.println(ti.innerNum);
        ti.InnerMethod();
    }
}
