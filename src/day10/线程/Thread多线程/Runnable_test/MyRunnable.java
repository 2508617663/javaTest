package day10.线程.Thread多线程.Runnable_test;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 21; i++) {
            System.out.println("run:"+i);
        }
    }
}
