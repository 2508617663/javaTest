package day10.线程.Thread多线程.线程安全;

public class TicketImpl implements Runnable {
    //定义一个多线程共享的票源
    private int ticket = 100;
    @Override
    public void run() {
        //使用死循环，让买票重复执行
        while (true){
            //首先判断票是否存在
            if (ticket>0){
                //票存在，卖票
                System.out.println(Thread.currentThread().getName()+"正在卖"+ticket+"张票");
                ticket--;
            }
        }

    }
}
