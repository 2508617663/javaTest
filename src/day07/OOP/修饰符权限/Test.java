package day07.OOP.修饰符权限;
/*
* Java中四种修饰符权限：
*               从大 public > protected > (default) > private 到小
*       同一个类       yes       yes         yes         yes
*       同一个包       yes       yes         yes         no
*   不同包，子类       yes       yes         no          no
* 不同包，非子类       yes       no          no          no
*
* public:公共的，都可以用
* protected:保护的，只有子类使用
* default：默认的，(即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
* private：私有的，只有自己能用
*
* */
public class Test {
}
