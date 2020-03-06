package day10.线程.Thread多线程.线程控制.join;
/**
 * 线程控制方法：
 *      public void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数
 *      void join()：等待这个线程死亡（执行完毕）其他线程才能执行
 *      void setDaemon(boolean on)：将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 *
 * */
public class join_test {
    public static void main(String[] args) {
        join_Thread j1 = new join_Thread();
        join_Thread j2 = new join_Thread();
        join_Thread j3 = new join_Thread();

        j1.setName("飞机");
        j2.setName("火车");
        j3.setName("自行车");



        j1.start();

        try {
            j1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        j2.start();
        j3.start();
    }
}
