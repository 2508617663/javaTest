package day09.collection集合.Set;
/**
 * java。util.LinkedHashSet集合 extends HashSet集合
 *  * LinkedHashSet集合特点：
 *  *      底层是一个哈希表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序），保证元素有序
 *  *
 *  * HashSet集合是：无序，不允许重复
 *  * LinkedHashSet集合是：有序，不允许重复
 *
 *
 * */
public class 哈希值 {
    public static void main(String[] args) {
        //创建person对象
        Person p1 = new Person();
        //打印hashCode方法返回的哈希码
        System.out.println(p1.hashCode());  //1239731077

        //创建person对象
        Person p2 = new Person();
        //打印hashCode方法返回的哈希码
        System.out.println(p2.hashCode());  //557041912

        System.out.println(p1);//day09.collection集合.Set.Person@49e4cb85  //49e4cb85就是1239731077的16进制表示
        System.out.println(p2);//day09.collection集合.Set.Person@2133c8f8  //2133c8f8就是557041912的16进制表示

        /**String类的哈希值*/
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("ab");
        System.out.println(str1.hashCode());//96354
        System.out.println(str2.hashCode());//96354
        System.out.println(str3.hashCode());//3105

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
    }
}
