package day10.线程.Thread多线程.线程控制.sleep;
/**
 * 线程控制方法：
 *      public void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数
 *      void join()：等待这个线程死亡（执行完毕）其他线程才能执行
 *      void setDaemon(boolean on)：将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 *
 * */
public class sleep_test {
    public static void main(String[] args) {
        sleep_thread t1 = new sleep_thread();
        sleep_thread t2 = new sleep_thread();
        sleep_thread t3 = new sleep_thread();

        t1.setName("飞机");
        t2.setName("高铁");
        t3.setName("自行车");


        t1.start();
        t2.start();
        t3.start();
    }
}
