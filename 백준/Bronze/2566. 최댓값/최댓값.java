import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때,
        //  최댓값 & 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하기

        int[][] arr = new int[9][9];


        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }

//        int max=arr[0][0]; // 최대값
        int max = -1; // 모든 값이 0일 때를 대비
        int a=0; // 몇 행
        int b=0; // 몇 열


        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                    a = i+1;
                    b = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(a+ " " + b);

    }
}
