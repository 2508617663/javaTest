package day10.线程.Thread多线程.线程控制.join;
/**
 * void join()：等待这个线程死亡（执行完毕）其他线程才能执行
 *
 *
 * */
public class join_Thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);
        }
    }
}
