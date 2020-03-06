package day07.OOP.polymorphism.Demo02;
/*
* 访问成员变量的两种方式：
 *   1，通过对象名称访问成员变量：看等号左边是谁则优先用谁，没有则想上找（左边是父类，父类的上面就只有Object了）
 *   2，间接通过成员方法访问成员变量：看该方法属于谁就优先用谁，没有则想上找
*
* */
public class Test {
    public static void main(String[] args) {
        Fu obj = new Zi();

        //1，通过对象名称访问成员变量：看等号左边是谁则优先用谁，没有则想上找（左边是父类，父类的上面就只有Object了）
        System.out.println(obj.num);
//        System.out.println(obj.age);  //错误写法

        //2，间接通过成员方法访问成员变量：看该方法属于谁就优先用谁，没有则想上找



    }
}
