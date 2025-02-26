import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int X = Integer.parseInt(sc.next());

        int[] A = new int[N];
    /*     A= Integer.parseInt(sc.next());  //이렇게 여기서 배열 A에 값 집어넣으면 안 됨. 값이 계속 쌓여야 하므로 for문안에 집어넣기*/

        for(int i =0; i<N; i++) {
            A[i] = Integer.parseInt(sc.next()); //여기에  +" "하면 안됨
            if(A[i] < X) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
