import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());

        // 뒤집어 담기 위해 int를 String 형태로 바꾸어야 함.
        StringBuffer sb = new StringBuffer(String.valueOf(B)).reverse();

        // 쪼개진 숫자들
        String[] splited = sb.toString().split("");

        // 각 자리수를 다시 정수로 변환
        for(int i = 0; i < splited.length; i++) {
            System.out.println( A * Integer.parseInt(splited[i]) );
        }

        System.out.println(A*B);

    }
}
