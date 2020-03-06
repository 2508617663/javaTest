package day07.OOP.Extends.Demo08_interface.interface_常量;
/*
* 接口当中也可以定义“成员变量”，但是必须使用public static final三个关键字修饰 （也就是常量）
* 格式
* public static final 数据类型 常量名称 = 数据值；
*
* 备注：
* 一旦使用final关键字修饰，说明值不可改变
*
* 注意：
*   1，接口当中的常量，可以省略public static final  注意，仅仅只是可以省略不写 ，不写也有相同的效果
*   2，接口当中的常量，必须进行赋值，因为值不可改变，为了保险起见没有默认值，所以必须认为进行赋值，不然会报错
*   3，接口中常量的名称，使用完全大写的字母，用下划线进行分割
*
*
* */
public interface Test {
    public static int NUM_OF_MY_CLASS = 10; //这里没有默认值，所以必须赋值，
//     int NUM = 10; //这两个是一样的
//    NUM = 20;     //值不可改变
}
