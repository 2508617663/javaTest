package day10.线程.Thread多线程.线程安全.Lock锁;

import java.net.HttpCookie;

/**
 * 模拟买票案例：
 * 创建三个线程，同时开启，对共享的票进行同时出售
 *
 *
 * 有三种方式来解决线程安全问题：
 *      1，同步代码块
 *      2，同步方法
 *      3，锁机制
 *
 * */
public class Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        TicketImpl t = new TicketImpl();
        //创建Thread类对象，传递Runnable接口的实现类对象
        Thread t0 = new Thread(t);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        //调用start方法开启线程
        t0.start();
        t1.start();
        t2.start();

    }
}
