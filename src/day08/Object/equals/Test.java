package day08.Object.equals;
/*
* equals方法:比较内存地址值
*
* */
public class Test {
    public static void main(String[] args) {
        //没有重写equals方法：比较内存地址值
        /*Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
        System.out.println(p1.equals(p2));  //false*/

        //重写equals方法后：比较内容
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
        System.out.println(p1.equals(p2));  //true
    }
}
