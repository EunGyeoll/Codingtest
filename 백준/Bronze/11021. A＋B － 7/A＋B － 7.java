import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 갯수
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("Case #" + i + ": "+ (a + b));
        }

        scanner.close();
    }
}

