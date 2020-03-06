package day07.OOP.Extends.Demo07_Abstract;

public class cat extends Abstract_Animal {
    //继承自抽象类必须要覆盖重写抽象类中所有的抽象方法
    @Override
    public void eat() {
        System.out.println("猫猫爱吃鱼");
    }

    @Override
    public void call() {
        System.out.println("猫会喵喵喵");
    }
}
