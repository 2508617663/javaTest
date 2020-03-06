package day10.线程.Thread多线程.线程控制.setDaemon;

public class setDaemon_Thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);

        }
    }
}
