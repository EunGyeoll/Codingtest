import java.util.Scanner;
import java.util.Arrays;

public class Main {
    // N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
    // 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt(); // 이거 꼭 해야 함!! int[] arr = new int[N]; 이건 그냥 배열 생성일뿐

            if(arr[i] < min) {
                min = arr[i];
//                arr[i] = min; 이거 아님 주의!! 대입 연산(=) 은 "오른쪽 값을 왼쪽 변수에 저장하는" 연산이기 때문에 좌변 우변의 위치가 바뀌면 동작이 달라짐
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(min +" " + max);
    }
}
