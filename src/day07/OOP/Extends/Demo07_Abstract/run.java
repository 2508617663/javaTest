package day07.OOP.Extends.Demo07_Abstract;

public class run {
    public static void main(String[] args) {
        //实例化猫对象
        cat cat = new cat();
        cat.eat();
        cat.call();

        //实例化狗对象
        dog dog = new dog();
        dog.eat();
        dog.call();

    }
}
