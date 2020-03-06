package day05.匿名对象.匿名对象作为参数;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* method(new Scanner(System.in));*/

        //使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        method02(sc);

        //使用匿名对象传入参数
        method02(new Scanner(System.in));

    }

   /* public static void method(Scanner sc){
        System.out.println("您输入的数是:" + sc.next());
    }*/
    public static void method02(Scanner sc){
        System.out.println("你输入的是:" + sc.nextInt());
    }
}
