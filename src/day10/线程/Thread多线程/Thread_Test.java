package day10.线程.Thread多线程;


/**
 * Thread类
 *
 *
 * Thread类构造方法：
 *      public Thread()：创建一个新的线程对象
 *      public Thread(String name)：创建一个指定名字的新的线程对象
 *      public Thread(Runnable target)：创建一个带有指定目标的新线程对象
 *      public Thread(Runnable target,String name)：创建一个带有指定目标新的线程对象并且指定名字
 *
 * Thread类常用方法：
 *      public String getName()：获取当先线程名称
 *      public void start()：JVM调用此线程的run方法并且开启线程
 *      public void run()：此线程要执行的任务代码在此定义
 *      public static void sleep(long millis)：使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
 *      static Thread currentThread()：返回对当前正在执行的线程对象的引用。
 * 设置和获取线程名称：
 *      Thread类中设置和获取线程名称的方法
 *      void SetName(String name)：将此线程的名称更改为‘name’
 *      String getName()：返回此线程的名称
 *
 *
 *
 * */
public class Thread_Test {
    public static void main(String[] args) {
        //创建两个线程
        My_Thread m1 = new My_Thread();
        My_Thread m2 = new My_Thread();
        /**public void start()：JVM调用此线程的run方法并且开启线程*/
        m1.start(); //线程名称：Thread-0
        m2.start(); //线程名称：Thread-1


    }
}
