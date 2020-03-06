package day07.OOP.Extends.Demo05_super的三种用法;

public class zi extends fu {
    int num = 20;


    public void Method(){
        //1，在子类的成员方法中,访问父类的成员变量
        System.out.println(super.num);

        //2，在子类的成员方法中，访问父类的成员方法
        super.methodFu();


    }

    //3，在子类的构造方法中，访问父类的构造方法
    public zi() {
        super();
    }
}
