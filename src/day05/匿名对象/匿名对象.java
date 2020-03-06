package day05.匿名对象;

import java.util.Scanner;

/*
* 创建对象的标准格式
* 类名称 对象名 = new 类名称（）；
*
* 匿名对象只能被调用一次，再次使用必须再创建一个对象
* 使用场景:如果确定有一个对象只需要被调用一次,就可以使用匿名对象
* */
public class 匿名对象 {
    public static void main(String[] args) {
        //标准格式创建对象
       /* person p = new person();    //这里第一个对象
        p.name = "华俊文";
        System.out.println(p.name);

        System.out.println("--------------------------");

        //匿名对象
        new person();   //第二个对象
        new person().name = "刘德华";      //第三个对象
        System.out.println(new person().name);  //输出结果为null     //第四个对象*/


        //匿名对象使用案例
        /*Scanner s = new Scanner(System.in);
        int num = s.nextInt();
//        int num1 = s.nextInt();
//        int num2 = s.nextInt();
        //这里可以新建很多变量来接收s.nextInt()的返回值，但是用匿名对象就只能使用一次
        System.out.println(num);*/

        //匿名对象使用案例
        int num = new Scanner(System.in).nextInt();
        System.out.println("您输入的数是:" + num);

        System.out.println("您输入的数是:" + new Scanner(System.in).next());
    }
}
