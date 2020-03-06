package day07.OOP.innerClass.局部内部类;
/*
* 在外部无法访问局部内部类，但是可以访问局部内部类外的方法，所以想访问到局部内部类中的数据，在局部内部类中就要把想获取的数据调用，然后这里调用局部内部类的成员方法
* */
public class demo01 {
    public static void main(String[] args) {
        Test t = new Test();
        t.Method(); //10
    }
}
