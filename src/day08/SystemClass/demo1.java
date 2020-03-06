package day08.SystemClass;
/*
* public static long currentTimeMillis()练习：
*
*用public static long currentTimeMillis()方法计算一个循环一千次的for循环共用时多少毫秒
*
* */
public class demo1 {
    public static void main(String[] args) {
        long run = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        long result = System.currentTimeMillis();
        System.out.println("--------------------------");
        System.out.println(result-run);
    }
}
