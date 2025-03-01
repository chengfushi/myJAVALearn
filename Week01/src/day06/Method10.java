package day06;

import java.util.Random;

/*
* 一个大V直播抽奖，奖品是现金红包，
* 分别有{2,588,888,1000,10000}五个奖金。
* 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
* 打印效果如下：（随机顺序，不一定是下面的顺序）
*/
public class Method10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] bonusArray = {2,588,888,1000,10000};

        int[] bonusIndexArray = new int[bonusArray.length];
        for (int i = 0; i < bonusArray.length;i++){
            int bonusIndex = random.nextInt(bonusArray.length);
            if (bonusIndexArray[bonusIndex] == 0){
                System.out.println(bonusArray[bonusIndex] + "元奖金被抽出");
                bonusIndexArray[bonusIndex] = 1;
            }
            else {
                i--;
            }
        }

    }
}
