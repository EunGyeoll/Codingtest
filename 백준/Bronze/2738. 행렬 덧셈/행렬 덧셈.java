import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
//                int[][] A = new int[N][M];
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
               B[i][j] = sc.nextInt();
            }
        }

        // 행렬 A+B 를 출력한다.
        // A+B한 행렬 = sum

        int[][] sum = new int[N][M];


        // sum 행렬 만들기
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }
        }

        // sum 행렬 출력
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
