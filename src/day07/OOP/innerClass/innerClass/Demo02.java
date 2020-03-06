package day07.OOP.innerClass.innerClass;
/*
* 成员内部类访问变量
* //访问内部类的局部变量：
* //System.out.println(num);
*
* //访问内部类的成员变量
* System.out.println(this.num);
*
* //访问外部类的局部变量
* System.out.println(Demo02.this.num);
*
* 如果变量名出现重名的情况：
* 外部类名称.this.外部类成员变量名
*
*
* */
public class Demo02 {   //外部类
    int num = 10;   //内部类成员变量
    public void Method(){   //外部类成员方法

    }

    public class Inner{     //内部类
        int num = 20;  //内部类成员变量

        public void InnerMethod() {//内部类成员方法
            int num = 30;   //内部类成员方法的局部变量
            //访问内部类的局部变量：
            System.out.println(num);
            //访问内部类的成员变量
            System.out.println(this.num);
            //访问外部类的局部变量
            System.out.println(Demo02.this.num);
        }
    }
}
