import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next()); // 바구니 갯수
        int M = Integer.parseInt(sc.next()); // 반복 횟수
        int[] arr = new int[N];

        // 둘째 줄부터 i j k. i번부터 j번 바구니에 k번 공을 넣는다.
        for (int x=0; x < M ; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            // i 번부터. 2번째라고 치면 arr[i]의 i는 1이어야 한다. i,j 가 2,5면 인덱스 1부터 4까지. y=i-1=1; y<=j-1
            for(int y = i-1 ; y <= j-1; y++){ // int y=0 으로 하는 거이 아니라 int y=i-1
                arr[y] = k;
            }
        }

        for(int z = 0; z<N; z++){
            System.out.print(arr[z] + " ");
        }

    }
}
