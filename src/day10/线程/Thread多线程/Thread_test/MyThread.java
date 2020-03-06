package day10.线程.Thread多线程.Thread_test;
/**
 * 设置和获取线程名称：
 * Thread类中设置和获取线程名称的方法
 * void SetName(String name)：将此线程的名称更改为‘name’
 * String getName()：返回此线程的名称
 * */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("hello");
    }

    public MyThread(String name) {
        super(name);
    }
}
