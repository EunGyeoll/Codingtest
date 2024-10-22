import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//       String nums[] =  bf.readLine().split("");

        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        // 출력할 시각 (분이 45분 미만일 때만 H-1임.)
        int newH = H-1;

        // 분이 45 이상인 경우
        int newM_1 = M-45;

        // 분이 45 미만인 경우
        int newM_2 = (60+M)-45;

        // 45분 일찍.
        // 10 에서 45분 일찍이면 25.
        // 25는 어떻게 나오나? (60+10)-45=25
        // 기존 시각이 45분 미만이면
        // (60+n)-45 가 분이 되고, 시각은 1이 작아진다.
        // 시각이 0일 경우에 대해서도 처리해 주어야 한다. 기존 시각이 0시면 22시로.
        // 이걸 어떻게 처리..
        // 0시는 24가 아니라 0시. 1시는 1시.
        // 시각이 0이면서 분이 45분 이상인 경우
        // 시각이 0이면서 분이 45분 이하인 경우

        if (H !=0 && M >= 45) {
            // 0시가 아니고 45분 이상이면
            System.out.print(H + " " + newM_1);
        } else if(H !=0 && M < 45)  {
            // 0시가 아니고 45분 미만이면
            System.out.print(newH + " " + newM_2);
        } else if (H ==  0) {
            // 시각이 0일 때 45분 이상인 경우와 45분 미만인 경우를 나눔.
            if(M >= 45) {
                System.out.print(H + " " + newM_1);
            } else if (M < 45) {
                System.out.print(23 + " " + newM_2);
            }

        }

        sc.close();

    }
}