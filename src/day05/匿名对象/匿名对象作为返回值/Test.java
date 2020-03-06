package day05.匿名对象.匿名对象作为返回值;

import java.util.Scanner;

/*
* 匿名对象作为返回值
*
* */
public class Test {
    public static void main(String[] args) {
//        sc();//调用sc类
        int i = sc().nextInt();
        System.out.println("您输入的数是:" + i);

    }
    public static Scanner sc(){
        return new Scanner(System.in);
    }
}
