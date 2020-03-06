package day07.OOP.Final.Final局部变量;
/*
 * 当final修饰一个局部变量的时候
 * 但是被final修饰的局部变量值不可改变
 * 一次赋值，终身不变
 *
 * 对于基本数据类型来说：final修饰的不可变指的是数据值不可改变
 * 对于引用数据类型来说：final修饰的不可变指的是地址值不可改变
 *
 *
 * */
public class Test {
    public static void main(String[] args) {
        //普通变量，内容是可变的
        int num1 = 10;
        num1 = 20;
        System.out.println(num1);       //输出为20

        //但是被final修饰的局部变量值不可改变
        //一次赋值，终身不变
        final int num2 = 30;
//        num2 = 40;    //错误写法
//        num2 = 30;    //错误写法 ，第二次赋值就算赋的值和原来的值一样也不行

        //正确写法
        //只要保证唯一只有一次赋值即可
        final int num3;
        num3 = 100;

        //对于引用数据类型来说：final修饰的不可变指的是地址值不可改变
        //没有用final修饰的情况
        Student stu1 = new Student("刘德华");
        stu1.setName("张国荣");
        System.out.println(stu1.getName());

        //使用final修饰的情况
        final Student stu2 = new Student("张家辉");
//        stu2 = new Student("郭富城");    //错误写法  ，地址值不可改变
        System.out.println(stu2.getName());

        stu2.setName("张家辉辉辉辉辉辉辉辉"); //但是用set方法对地址值里面的内容可以改变
        System.out.println(stu2);

    }

}
