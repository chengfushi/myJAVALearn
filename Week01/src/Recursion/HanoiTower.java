package Recursion;

public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.move(3,'A','B','C');
    }
}
class Tower{
    public void move(int num,char a,char b,char c){
        //如果只有一个盘
        if (num == 1){
            System.out.println(a + "->" + c);
        }else {
            //将上面的盘从A移动到B
            move(num - 1,a,c,b);
            //将最下面的盘从A移动到C
            System.out.println(a + "->" + c);
            //将B上的盘移动到C
            move(num - 1,b,a,c);
        }

    }
}