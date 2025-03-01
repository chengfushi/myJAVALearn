package day05;

public class Parameter {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        Text text = new Text();
        text.changeArrayElem(arr);
        System.out.println(arr[0]);

    }
}
class Text{
    public void changeArrayElem(int[] arr){
        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
