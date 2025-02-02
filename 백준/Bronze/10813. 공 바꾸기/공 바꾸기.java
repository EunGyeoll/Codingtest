import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 바구니 N 개
        int M = sc.nextInt(); // M 번 공을 바꿈

        int arr[] = new int[N]; // 바구니

        for(int x = 0; x< N; x++) {
            arr[x] = x+1; // 인덱스 0번 = 1번째 = x+1
        }

        for(int y = 0; y < M; y++) {
            //  i번 바구니와 j번 바구니에 들어있는 공을 교환
            int i = sc.nextInt();
            int j = sc.nextInt();

            int temp = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = temp;
        }

        for(int z=0; z<N; z++) {
            System.out.print(arr[z] + " ");
        }
    }
}
