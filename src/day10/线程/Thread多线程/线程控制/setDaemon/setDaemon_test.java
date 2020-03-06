package day10.线程.Thread多线程.线程控制.setDaemon;
/**
 * 线程控制方法：
 *      public void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数
 *      void join()：等待这个线程死亡（执行完毕）其他线程才能执行
 *      void setDaemon(boolean on)：将此线程标记为守护线程，当运行的线程都是守护线程时，Java虚拟机将退出
 *
 * */
public class setDaemon_test {
    public static void main(String[] args) {
        setDaemon_Thread s1 = new setDaemon_Thread();
        setDaemon_Thread s2 = new setDaemon_Thread();
        
        s1.setName("张飞");
        s2.setName("关羽");

        s1.setDaemon(true);
        s2.setDaemon(true);
        
        Thread.currentThread().setName("刘备");
        
        

        s1.start();
        s2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
