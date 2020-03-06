package day10.线程.Thread多线程.线程安全.静态同步方法;
/**
 * 解决线程安全方案二：静态同步方法
 *
 *
 *
 *
 * */
public class TicketImpl implements Runnable {
    //定义一个多线程共享的票源
    private static int ticket = 100;
    @Override
    public void run() {
        //使用死循环，让买票重复执行
        while (true){
            Method();
        }

    }
    /**
     * 在同步方法的基础上加上一个static关键字使其称为静态同步方法
     * 静态同步方法中锁对象是谁？
     * 不能是this，因为this是创建对象之后产生的，静态方法优先于对象
     * 静态方法的锁对象是本类的class属性-->class文件对象（反射）
     * */
    public static synchronized void Method(){
        //首先判断票是否存在
        if (ticket>0){
            //票存在，卖票
            System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
            ticket--;
        }
    }
}
