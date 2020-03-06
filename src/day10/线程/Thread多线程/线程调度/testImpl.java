package day10.线程.Thread多线程.线程调度;

public class testImpl extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
        System.out.println(getName()+i);
        }
    }

    //创建带参数的构造方法，方便new线程的时候给线程取名字
    public testImpl(String name) {
        super(name);
    }
}
