package Recursion;

public class MonkeyPeach {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        System.out.println(monkey.peach(1));
    }

}
class Monkey{

    public int peach(int day){
        if (day == 10) return 1; //第10天只有1个桃子个桃子
        else if (day >= 1 && day <= 9) return (peach(day + 1) + 1) * 2;
        else return  - 1;
    }
}
