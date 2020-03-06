package day10.线程.Thread多线程;
/** 设置和获取线程名称：
 *      Thread类中设置和获取线程名称的方法
 *      static Thread currentThread()：返回对当前正在执行的线程对象的引用。
 *      void SetName(String name)：将此线程的名称更改为‘name’
 *      String getName()：返回此线程的名称

 */
public class My_Thread extends Thread {
    @Override
    public void run(){
        /**public String getName()：获取当先线程名称*/
        System.out.println(getName());

        /**void SetName(String name)：将此线程的名称更改为‘name’*/
        Thread.currentThread().setName("mythread线程");
    }
}
