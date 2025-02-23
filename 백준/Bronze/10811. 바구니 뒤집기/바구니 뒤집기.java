import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 바구니 총 N개, M번 반복
            // 왼쪽으로부터 i번째 바구니부터 j번째 바구니의 순서를 역순
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] arr = new int[N]; // 바구니 총 N개이므로

            for(int w = 0; w < N; w++) {
//                arr[w] += 1; 
                arr[w] = w+1;
            }

            for(int q=0; q< M; q++) {
                int i= sc.nextInt()-1; // 입력한 i는 실제로 배열에서 i-1번째
                int j= sc.nextInt()-1; // 입력한 j는 실제로 배열에서 j-1번째

                while(i<j){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;  // 왼쪽 포인터 증가
                    j--;  // 오른쪽 포인터 감소
                }

//                    for(int k = 0; k < arr.length; k++) {
//                        int temp= arr[i];
//                        arr[i]= arr[j];
//                        arr[j]= temp;
//                    }
            }

            sc.close();

           for (int a:arr){
               System.out.print(a+ " ");
           }
        }
}
