package day10.线程.Thread多线程.Runnable_test;
/**
 * 创建多线程第二种方式：实现Runnable接口，重写run()方法
 * java.lang.Runnable
 *      Runnable接口应该由那些打算通过某一线程执行其实例的类来实现，类必须定义一个称为run的无参数方法
 * java.lang.Thread类的构造方法
 *      Thread(Runnable target)：分配新的Thread对象
 *      Thread(Runnable Target,String name) ：分配新的Thread对象
 *
 * 实现步骤：
 *      1，创建一个Runnalbe接口的实现类
 *      2，在实现类中重写Runnable接口的run方法，设置线程任务
 *      3，创建一个Runnable接口的实现类对象
 *      4，创建Thread类对象，构造方法中传递Runnable接口的实现类对象
 *      5，调用Thread类中的start方法，开启新的线程执行run方法
 * 实现Runnable接口的创建多线程程序的好处：
 *      1，避免了单继承的局限性
 *          一个类只能继承一个类，所以一个Thread子类就不能继承其他类了，但是Runnable
 *          是implements实现，可以创建线程的同时还能继承其他类
 *      2，增强了程序的拓展性，降低了程序的耦合性（解耦）
 *
 *
 * */
public class Runnable_test {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        new Thread(mr).start();//开启多线程


        for (int i = 1; i < 21; i++) {
            System.out.println("main:"+i);
        }

        /**
         * 执行结果
         * run:1
         * main:1
         * run:2
         * main:2
         * run:3
         * main:3
         * run:4
         * main:4
         *.......
         *
         * */
    }
}
