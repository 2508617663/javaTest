package day07.OOP.Final.Final成员变量;
/*
* 当Final关键字来修饰成员变量：
* 格式：
* final 数据类型 变量名 = 值；
*
*   1，由于成员变量具有默认值，所以用了final关键字之后必须手动赋值，不会再给默认值了
*   2，对于被final修饰的成员变量，要么使用直接赋值，要么通过构造方法赋值
*
* final修饰的成员变量没有默认值，所以在创建时必须赋值
*
*
* */
public class Test {
//    final int num;  //错误写法
    //直接赋值
//    final int num = 10;
    //或者通过构造方法赋值
    final int num;
    public Test() {
        this.num = 10;  //通过构造方法赋值
    }
}
