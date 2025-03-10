import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 직사각형의 경계선까지 가는 거리의 최솟값

        // 현재: x, y
        int x = sc.nextInt();
        int y = sc.nextInt();

        // 직사각형: 왼쪽아래 꼭짓점: (0,0) , 왼쪽위 꼭짓점: (w,h)
        int w = sc.nextInt();
        int h = sc.nextInt();

        int x_min = Math.min(x, w-x); // 왼쪽 경계선까지 거리: x, 오른쪽 경계선까지 거리: w - x 중 작은 숫자 출력
        int y_min = Math.min(y, h-y);

        int minDistance = Math.min(x_min, y_min);
        System.out.println(minDistance);
    }
}
