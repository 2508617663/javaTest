package day10.线程.Thread多线程.线程控制.sleep;

public class sleep_thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+i);
            /**public void sleep(long millis)：使当前正在执行的线程停留（暂停执行）指定的毫秒数*/
            try {
                Thread.sleep(1000); //这个线程每1000毫秒（一秒）执行一次/暂停疫苗再执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
