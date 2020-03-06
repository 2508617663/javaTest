package day10.线程.Thread多线程.线程安全.同步方法;

/**
 * 解决线程安全问题的第二种方案：使用同步方法
 * 使用步骤：
 *      1，把访问了共享数据的代码抽取出来，放到一个方法中
 *      2，在方法上添加synchronized修饰符
 * 格式：
 *      修饰符 synchronized 返回值类型 方法名（参数列表）{
 *          //可能会出现线程安全问题的代码（访问了共享数据的代码）
 *      }
 *
 *
 * */
public class TicketImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;
    @Override
    public void run() {
        //使用死循环，让买票重复执行
        while (true){
            Method();
        }
    }

    /**定义一个方法用关键字synchronized修饰，把有可能发生线程安全的代码放入下面
     * 同步方法也会把方法内部的代码锁住只让一个线程执行，那么同步方法的锁对手是“this”
     * 谁调用的这个方法锁对象就是谁
     * */
    public synchronized void Method(){
        //首先判断票是否存在
        if (ticket>0){
            //票存在，卖票
            System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
            ticket--;
        }
    }
}
