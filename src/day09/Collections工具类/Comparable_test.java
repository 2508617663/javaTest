package day09.Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Comparator和Comparable的区别
 *      Comparable_test：自己（this）和别人（参数）比较，自己需要实现Comparable接口，重写比较的规则compareTo方法
 *      Comparator：相当于找一个第三方的裁判，比较两个
 *
 *
 * */
public class Comparable_test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,16,85,10,9);
        System.out.println(list);//[1, 6, 8, 10, 9]

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;   //降序
//                return o1-o2;   //升序
            }
        });
        System.out.println(list);
    }
}
