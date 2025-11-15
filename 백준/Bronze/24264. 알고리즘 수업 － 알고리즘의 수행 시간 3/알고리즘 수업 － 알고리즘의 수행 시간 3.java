import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n*n을 하면 int의 범위를 벗어날 것이므로 n을 long으로 설정
        long n = sc.nextLong(); 

        System.out.println(n*n);
        System.out.println(2);

        sc.close();  
    }
}