package day07.OOP.Extends.Demo02;

public class run {
    public static void main(String[] args) {
        fu fu = new fu();
        System.out.println(fu.funum);   //10  父类只能调用自己本类中的属性
//        System.out.println(fu.zinum);

        System.out.println("-----------------------");

        zi zi = new zi();
        System.out.println(zi.funum);   //但是子类可以调用子类自己，以及继承的父类的属性
        System.out.println(zi.zinum);


        System.out.println("------------------------");
        //如果父子类中的属性有重名的情况  fu num = 100     zi num = 200
        System.out.println(zi.num);     //200       //加入子类中没有num属性这里将会是100
        System.out.println(fu.num);     //100


    }
}
