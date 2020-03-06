package day07.OOP.innerClass.类作为成员变量;

public class run {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("小炮");
        hero.setAge(18);

        //创建一个武器对象
        Weapon weapon = new Weapon("暴风大剑");
        hero.setWeapon(weapon);

        hero.attack();
    }
}
