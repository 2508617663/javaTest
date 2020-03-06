package day07.OOP.Extends.Demo08_interface.interfaceDefault;

public class run {
    public static void main(String[] args) {
        DemoA da = new DemoA();
        da.Method01();
        da.MethodDefault();      //在不改变实现类的情况下新增了一个方法

        System.out.println("--------------------");


        //同时默认方法也可以在实现类中进行覆盖重写
        DemoB db = new DemoB();
        db.Method01();      //实现了覆盖重写BBBBBBBBBB
        db.MethodDefault(); //覆盖重写了接口中的默认方法
    }
}
