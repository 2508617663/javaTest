package day09.collection集合.Set;

import java.util.HashSet;

/**
 * HashSet存储自定义类型元素：
 *  Set集合报错元素唯一：
 *      存储的元素（String,Integer......Student,Person....）,必须重写HashSet方法和equals方法
 *
 * 要求：
 *      同名和同年龄的人，视为同一个人，只能存储一次
 *
 * */
public class HashSet存储自定义类型元素 {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("张三",18);
        Student stu3 = new Student("张三",19);

        HashSet<Student> set = new HashSet();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set);
    }
}
