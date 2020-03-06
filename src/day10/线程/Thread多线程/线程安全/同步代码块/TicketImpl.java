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
public class TicketImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();


    //设置线程任务：买票
    @Override
    public void run() {
        //使用死循环，让买票重复执行
        while (true){
            //首先判断票是否存在
            synchronized (obj){
                if (ticket>0){
                    //票存在，卖票
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
                    ticket--;
                }
            }
        }

    }
}
