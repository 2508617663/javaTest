package day09.collection集合;

public class jisuanqi {
    public static void main(String[] args) {
        int num = method(100,20);
        System.out.println(num);
    }

    public static int method(int...num){
        int result = 0;
        for (int i : num){
            result += i;
        }
        return result;
    }
}
