package day10.线程.Thread多线程.Thread_test;

import day10.线程.Thread多线程.My_Thread;

import java.util.Date;

/**
 * java.lang.Thread类（线程类）
 *
 * 创建程序的第一种方式：创建Thread类的子类
 *      java.lang.Thread类（线程类）是描述线程的类，我们想要实现多线程程序，就必须继承Thread类
 * 实现步骤：
 *      1，创建一个Thread类的子类（或者继承Thread类）
 *      2，在Thread类的子类中重写Thread类的run方法，设置线程任务（开启线程要做什么）
 *      3，创建Thread类的子类对象
 *      4，调用Thread类中的start方法开启线程，执行run方法
 *              void start()使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
 *              结果是两个线程并发地运行；当前线程（main线程）和另一个线程（执行其 run 方法）。
 *              多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
 * java程序属于抢占式调度，哪个线程的优先级高，哪个线程优先执行，同一个优先级，随机选择一个执行
 *
 *
 *
 *
 * */
public class Thread_test {
    public static void main(String[] args) {
        MyThread m1 = new MyThread("asd");
        MyThread m2 = new MyThread("sdf");
        m1.start();
        m2.start();
/**
 * 设置和获取线程名称：
 * Thread类中设置和获取线程名称的方法
 * void SetName(String name)：将此线程的名称更改为‘name’
 * String getName()：返回此线程的名称
 * */
        //String getName()：返回此线程的名称
        System.out.println(m1.getName());//Thread-0
        System.out.println(m2.getName());//Thread-1

        //void SetName(String name)：将此线程的名称更改为‘name’
        /*m1.setName("自定义线程1");
        m2.setName("自定义线程2");
        System.out.println(m1.getName());//自定义线程1
        System.out.println(m2.getName());//自定义线程2*/
    }
}
