package day05.String.字符串常量池;
/*
* == 在字符串种是进行内存地址值比较,如果想对字符串的内容进行比较用equals方法
* public boolean equals()
* */
public class equals {
    public static void main(String[] args) {
        String str1 = "abc";    //这个在堆内存种的常量池种

        char[] charArray = {'a','b','c'};   //这个在堆内存种的数组种
        String str2 = new String(charArray);

        //用 == 进行地址值比较显然它们不在一个地方
        System.out.println(str1 == str2);   //false

        System.out.println(str1.equals(str2));  //true  它俩值 都是abc 所以结果为true
        System.out.println(str1.equals("abc")); //true


    }
}
