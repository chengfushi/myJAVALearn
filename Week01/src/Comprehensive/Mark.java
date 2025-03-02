package Comprehensive;

public class Mark {
    public static void main(String[] args) {
        Judge judge = new Judge();

        int[] source = {100, 99, 98, 97, 96,80};

        System.out.println(judge.getMark(source));
    }
}
class Judge{
    public int getMark(int[] source){
        int sum = 0;
        int maxMark = 0;
        int minMark = 100;

        for (int i = 0; i <source.length; i++){
            sum += source[i];
            if (source[i] > maxMark) maxMark = source[i];
            if (source[i] < minMark) minMark = source[i];
        }
        return  (sum - maxMark - minMark) / (source.length - 2);
    }
}
