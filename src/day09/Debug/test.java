package day09.Debug;

import java.util.Random;

/**
 * Debug调试程序：
 *      可以让代码逐行执行，查看代码的执行过程，调试程序中出现的bug
 * 使用方式：
 *      在行号的左边，鼠标左键单击添加断点，右键选择Debug执行程序程序就会停留在添加的第一个断点处
 * 执行程序：
 *      F8：逐行执行
 *      F7：进入到方法中
 *      Shift+F8：跳出方法
 *      F9：跳到下一个断点，如果没有下一个断点那么就结束程序
 *      Ctrl+F2：退出Debug模式，停止程序
 *      Console：切换到控制台
 *
 *
 * */
public class test {
    public static void main(String[] args) {

        System.out.println(";;;;;;;;;;");
        System.out.println(";;;;;;;;;;");
        Method();
        Random r = new Random();
        for (int i = 0; i <10 ; i++) {
            System.out.println(r.nextInt(10));
        }
    }

    private static void Method() {
        System.out.println("HelloWorld1");
        System.out.println("HelloWorld2");
        System.out.println("HelloWorld3");
        System.out.println("HelloWorld4");
        System.out.println("HelloWorld5");
    }
}
