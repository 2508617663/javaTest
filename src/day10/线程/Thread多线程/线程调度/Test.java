package day10.线程.Thread多线程.线程调度;
/**
 * 线程的调度
 * 线程由两种调度模型：
 *      1，分时调度模型：所有线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间片
 *      2，抢占式调度模型：优先让优先级高的线程使用CPU，如果线程的优先级相同，那么会随机选择一个。
 *          优先级高的线程获取CPU时间片相对多一些
 * java使用的是抢占式调度模型（也就是说可以认为设置线程的优先级）
 * Thread类中设置和获取线程优先级的方法：
 *      public final int getPriority()：返回此线程的优先级
 *      public final void SetPriority(int newPriority)：更改此线程的优先级
 *
 * 线程的默认优先级是5
 * 线程范围
 *          最大为：10
 *          最小为：1
 *
 *
 * */
public class Test {
    public static void main(String[] args) {
        testImpl t1 = new testImpl("飞机");
        testImpl t2 = new testImpl("高铁");
        testImpl t3 = new testImpl("自行车");


//        /**public final int getPriority()：返回此线程的优先级*/
//        System.out.println(t1.getName()+"的优先级为：" + t1.getPriority());    //h线程优先级为5
//        System.out.println(t2.getName()+"的优先级为：" + t2.getPriority());    //h线程优先级为5
//
//        /**public final void SetPriority(int newPriority)：更改此线程的优先级*/
        t1.setPriority(10);//飞机
        t2.setPriority(5);//高铁
        t3.setPriority(1);//自行车
////        h.setPriority(11);  //超出范围
//        System.out.println(t1.getName()+"更改后的优先级为：" + t1.getPriority());
//        System.out.println(t2.getName()+"更改后的优先级为：" + t2.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}
