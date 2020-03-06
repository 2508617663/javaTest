package day09.collection集合;
/**
 * 可变参数：
 * 可变参数是Java1.5之后出现的新特性
 * 使用前提：当方法的参数列表数据类型已经确定，但是参数的个数不确定，就可以使用可变参数
 * 使用格式：定义方法时使用
 *      修饰符 返回值类型 方法名（数据类型...变量名）{}
 *      //...就是代表多个参数
 * 可变参数原理：
 *      可变参数底层就是一个数组，根据传递参数个数不同，会创建不同长度的数组来存储这些参数
 *      传递的参数个数可以时0个（不传递）也可以是1，2，3...多个
 *
 * 可变参数的注意事项：
 *  1，一个方法的参数列表，只能有一个可变参数
 *  2，如果方法的参数有多个，那么可变参数必须卸载列表的末尾
 *
 *
 *  可变参数的终极写法：
 *  public static void method(Object...obj){}
 *
 *
 *
 *
 * */
public class 可变参数 {
    public static void main(String[] args) {
//        int num1 = Method01(10,20);  //计算两个int数之和
//        System.out.println(num1);

        int num2 = Method02(10,20,30,40);
        System.out.println(num2);
    }
    //计算两个int数之和
    public static int Method01(int a,int b){
        return a+b;
    }
    /**假如需求变化，在不改代码就可以计算三个，或者四个，多个int数之和，就可以用可变参数*/
    public static int Method02(int... num){
//        System.out.println(num);
//        System.out.println(num.length);
        //定义一个初始化变量，记录累加求和
        int sum = 0;
        //遍历数组
        for (int i: num){
            //累加求和
            sum += i;
        }
        return sum;
    }

}
