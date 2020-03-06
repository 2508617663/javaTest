package day10.线程.Thread多线程.innerClassThread;
/**
 * 使用匿名内部类的方式创建多线程
 * 格式：
 *      new Thread(){
 *          //重写run方法
 *      }.start();  //开启线程
 *
 *
 * */
public class InnerClassThread_test {
    public static void main(String[] args) {
        new Thread(){   //创建一个匿名内部类
            @Override
            public void run(){  //重写run方法
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"\t"+"Hello,World"+i);
                }
            }
        }.start();  //开启多线程

        Runnable r = new Runnable(){   //创建一个匿名内部类
            @Override
            public void run(){  //重写run方法
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"\t"+"Hello,World"+i);
                }
            }
        };
        new Thread(r).start();  //开启多线程

    }
}
