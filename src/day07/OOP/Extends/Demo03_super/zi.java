package day07.OOP.Extends.Demo03_super;

public class zi extends fu {
    int num = 20;   //子类中的成员变量

    public void Method(){
        int num = 30;   //子类中的局部变量
        System.out.println(num);         //本类的局部变量   30
        System.out.println(this.num);    //本类的成员变量   20
        System.out.println(super.num);    //父类的成员变量   10
    }
}
