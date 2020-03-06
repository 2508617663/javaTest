package day07.OOP.Extends.Demo02;
/*
* 在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：
* 直接通过子类对象访问成员变量
*   等号左边时谁就优先用谁，没有则向上（父类）找
* 间接通过成员方法访问成员变量
*
* */
public class fu {
    int funum = 10;

    int num = 100;

}
