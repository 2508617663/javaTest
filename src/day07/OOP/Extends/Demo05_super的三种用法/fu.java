package day07.OOP.Extends.Demo05_super的三种用法;
/*
* •Super关键字的三种用法
    * 1，在子类的成员方法中,访问父类的成员变量     //num
    * 2，在子类的成员方法中，访问父类的成员方法     //super.父类方法名
    * 3，在子类的构造方法中，访问父类的构造方法     //super()
*
*
*
* */
public class fu {
    int num = 10;

    public void methodFu(){
        System.out.println("我是父类的方法");
    }

}
