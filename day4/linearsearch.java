package day4;
import java.util.*;
public class linearsearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int find = 30;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }
}