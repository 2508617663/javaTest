package day10.线程.Thread多线程.线程安全.同步代码块;

/**
 * 卖票案例出现了线程安全问题，卖出了不存在的票和重复的票
 *
 * 解决线程安全问题解决方案一：使用同步代码块
 * 格式：
 *      synchronized(锁对象){
 *          //可能会引发线程安全的代码（访问了共享数据的代码）
 *      }
 * 注意：
 *      1，通过代码块中的锁对象，可以是任意的对象
 *      2，但是必须保证多个线程使用的锁对象是同一个
 *      3，锁对象作用：把同步代码块锁住，只让一个线程在代码块中执行
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
