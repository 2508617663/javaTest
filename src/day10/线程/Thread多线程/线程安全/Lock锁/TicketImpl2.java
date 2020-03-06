package day10.线程.Thread多线程.线程安全.Lock锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全方案三：LOck锁
 * java.util.concurrent.locks.Lock接口
 * Lock接口 实现提供了比使用 synchronized 方法和语句可获得的更广泛的锁定操作。
 * Lock中常用的方法：
 *      void Lock()：获取锁
 *      void unLock：释放锁
 *
 * 子类：
 * java.util.concurrent.locks.ReentrantLock implements Lock接口
 *
 * 使用步骤：
 *      1，在成员位置创建一个ReentrantLock接口
 *      2，在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁
 *      3，在可能会出现安全问题的代码后调用Lock接口中的方法unLock获取锁
 *
 *
 *
 * */
public class TicketImpl2 implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;

    /**1，在成员位置创建一个ReentrantLock对象*/
//    ReentrantLock r = new ReentrantLock();
    Lock r = new ReentrantLock();


    @Override
    public void run() {
        //使用死循环，让买票重复执行
        while (true){
            /**2，在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁*/
            r.lock();//2，在可能会出现安全问题的代码前调用Lock接口中的方法Lock获取锁

            //首先判断票是否存在
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    //票存在，卖票
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {      /**无论异常是否发生，finally里面的释放锁都会执行，不会影响其他线程获取到锁*/
                    /**3，在可能会出现安全问题的代码后调用Lock接口中的方法unLock获取锁*/
                    r.unlock();//3，在可能会出现安全问题的代码后调用Lock接口中的方法unLock获取锁
                }
            }
        }
    }
}
