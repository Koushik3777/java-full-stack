package day4;
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int find = 40;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == find) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < find) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}