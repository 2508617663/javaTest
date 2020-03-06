package day07.OOP.Extends.Demo06_this的三种用法;
/*
* super关键字用来访问父类内容，而this关键字用来访问本类内容，用法也有三种
*   1，在本类的成员方法中，访问本类的成员变量
*   2，在本类的成员方法中，访问本类的另一个成员方法
*   3，在本类的构造方法中，访问本类的另一个构造方法
* 在第三种用法中要注意
*   A，this(...)调用也必须是构造方法的第一个语句，唯一一个
*   B，super和this两种构造调用不能同时使用
* */
public class Zi extends Fu {
    int num = 20;




    public void MethodZi(){
        int num = 30;

        //1，在本类的成员方法中，访问本类的成员变量
        System.out.println(num);        //30
        System.out.println(this.num);   //20
        System.out.println(super.num);   //10

        //2，在本类的成员方法中，访问本类的另一个成员方法
        this.MethodZiA();
    }

    public void MethodZiA(){
        System.out.println("我是子类的第二个成员方法");
    }

    //3，在本类的构造方法中，访问本类的另一个构造方法
    public Zi(){    //无参构造
        this(100);  //无参构造调用有参构造并且传值【构造方法的重载调用】
    }
    public Zi(int n){   //有参构造

    }


}
