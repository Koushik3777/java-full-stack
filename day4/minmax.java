package day4;
public class minmax {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int min = arr[0];
        int max = arr[0];
        for(int x : arr){
            if(x > max) max = x;
            if(x < min) min = x;
        }
        System.out.println("min number : "+min);
        System.out.println("max number : "+max);
    }
}
