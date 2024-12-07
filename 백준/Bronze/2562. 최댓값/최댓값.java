import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[9];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int max = Integer.MIN_VALUE;
        int index = 0; // 최댓값이 몇 번째인지

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }
}
