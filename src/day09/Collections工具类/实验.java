package day09.Collections工具类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 * 随手练习：
 * 把随机产生的1-100的1000个随机数存入ArrayList集合中
 *
 * */
public class 实验 {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        for (int j = 0; j <1000 ; j++) {
            Random r = new Random();
            int i = r.nextInt(100)+1;
            Collections.addAll(list,i);
        }
        System.out.println(list);
    }
}
