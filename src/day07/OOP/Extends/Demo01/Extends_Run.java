package day07.OOP.Extends.Demo01;

public class Extends_Run {
    public static void main(String[] args) {
        zi zi = new zi();   //new了一个子类对象
        //子类对象中有父类对象的方法，说明子类继承了父类中的Method方法
        zi.Method();        //子类对象中有父类对象的方法，说明子类继承了父类 中的Method方法


        //另一个子类
        zi_2 zi2 = new zi_2();
        zi2.Method();   //我是父类中的方法
    }
}
