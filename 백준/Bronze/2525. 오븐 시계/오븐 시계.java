import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 시각
        String strNums = scanner.nextLine();
        // 소요되는 분
        int takenMinute = Integer.parseInt(scanner.nextLine());

        // 문자열 배열(시각)을 정수 배열인 intNums로 변환
        String[] strNumsArr = strNums.split(" ");
        int[] intNums = new int[strNumsArr.length];
        for (int i = 0; i < strNumsArr.length; i++) {
            intNums[i] = Integer.parseInt(strNumsArr[i]);
        }


        // 1. 합쳐서 60분 미만인 경우
        if(intNums[1] + takenMinute < 60) {
            System.out.println(intNums[0] + " " + (intNums[1]+takenMinute)%60);
        }

        // 2. 합쳐서 60분 이상이어서 시각 변경 필요한 경우
        else if (intNums[1] + takenMinute >= 60) {

            // 1) 24시 이상인 경우 0시부터로 변경 필요
            if(intNums[0] + (intNums[1]+takenMinute) /60 >= 24) {
                // 23시인 경우 더해지는 분에 따라서 0시, 1시가 되어야 함.
                // 23 + 2 = 25 => 1 이 되어야 함.
                // (intNums[0] + takenMinute/60) - 24 = 1

                int newTime = (intNums[0] + (intNums[1]+takenMinute)/60) - 24;
                int additionalMinute = (intNums[1] + takenMinute) - 60;
                System.out.println( newTime + " " + additionalMinute%60);

            } // 2) 24시 미만인 경우
            else {
                // 40+80 = 120. 120 나누기 60=2. 몫을 구해야 함. 몫=시간
                int additionalTime= (intNums[1] + takenMinute) / 60;
                // 만약 합이 130이면 나머지 = 분
                int additionalMinute = (intNums[1] + takenMinute) - 60;
                System.out.println(intNums[0] + additionalTime + " " + additionalMinute%60);
            }

        }
    }
}

