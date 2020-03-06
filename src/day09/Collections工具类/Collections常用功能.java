package day09.Collections工具类;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/**
 * java.util.collections工具类
 * Collections工具类中常用功能
 *      public static <T> boolean addAll(Collection<T> c,T...elements)  ：往集合中添加多个元素
 *      public static void shuffle(List<?> list) ：打乱集合顺序
 *      public static <T> void sort(List<T> list) ：将集合中元素按照默认规则排序
 *      public static <T> void sort(List<T> list,Comparator<? super T>) ：将集合中元素按照指定规则排序
 * 注意：
 *      shuffle，sort方法只对List集合有用，不能用作在Set集合上
 * sort(List<T> list)使用前提
 * 被排序的集合里边存储的元素，必须实现Comparable接口 ，重写接口中的方法compareTo定义排序的规则
 *
 * 自定义排序：
 *      实现Comparable接口，覆盖重写compareTo方法
 *      return this.getAge() - o.getAge();//年龄升序排序
 *      return o.getAge() - this.getAge();//年龄降序排序
 *
 *
 *
 * */
public class Collections常用功能 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("TicketImpl");
        list.add("b");
        list.add("c");
        System.out.println(list);//[TicketImpl, b, c]
        /**public static <T> boolean addAll(Collection<T> c,T...elements)  ：往集合中添加多个元素*/
        Collections.addAll(list,"d","e","f","g");//addAll参数是可变参数（T...）所以参数可以是n个
        System.out.println(list);//[TicketImpl, b, c, d, e, f, g]

        /**public static void shuffle(List<?> list) ：打乱集合顺序*/
        Collections.shuffle(list);//打乱list集合顺序
        System.out.println(list);//[b, e, c, TicketImpl, f, d, g]

        /**public static <T> void sort(List<T> list) ：将集合中元素按照升序排序*/
        Collections.sort(list);//把list集合按照升序进行排序
        System.out.println(list);   //[TicketImpl, b, c, d, e, f, g]

        /**public static <T> void sort(List<T> list,Comparator<? super T>) ：将集合中元素按照指定规则排序*/
//        Collections.sort(list,);



        /**自定义类型的排序*/
        ArrayList<Person> l = new ArrayList<>();
        l.add(new Person("张三",18));
        l.add(new Person("李四",39));
        l.add(new Person("王五",20));
        System.out.println(l);//[Person{name='张三', age=18}, Person{name='李四', age=39}, Person{name='王五', age=20}]

        Collections.sort(l);//对Person类进行对Comparable的实现，并且重写后compareTo方法，按照自定义的对年龄进行升序排序
        System.out.println(l);//排序后的结果：[Person{name='张三', age=18}, Person{name='王五', age=20}, Person{name='李四', age=39}]

    }
}
