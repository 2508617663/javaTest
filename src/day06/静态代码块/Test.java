package day06.静态代码块;
/*
* 静态代码块:只在用到此类时执行唯一一次
* 静态内容会优先非静态,所以静态代码块会比构造方法先执行
* */
public class Test {
    static {
        System.out.println("静态代码块执行了");
    }

    public Test() {
        System.out.println("我是Test的构造方法");
    }

    public static void main(String[] args) {
        Test one = new Test();    //这里new了一个本类对象,也就是说这里调用了自己,所以这里会执行静态代码块
        /*
        * 输出结果
        * 静态代码块执行了
        * 我是Test的构造方法
        *
        * */

        System.out.println("-----------------");
        Test two = new Test();  //new了第二个对象,但是静态代码块只执行一次,
        /*
        * 输出结果
        * 我是Test的构造方法
        * */
    }
}
