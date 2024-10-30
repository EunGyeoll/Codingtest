import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String strNums = scanner.nextLine();

        // 문자열 배열을 정수 배열로 변환
        String[] strNumsArr = strNums.split(" ");
        int[] intNums = new int[strNumsArr.length];
        for (int i = 0; i < strNumsArr.length; i++) {
            intNums[i] = Integer.parseInt(strNumsArr[i]);
        }

        // 첫 번째 조건: 같은 눈이 3개인 경우
        if (intNums[0] == intNums[1] && intNums[1] == intNums[2]) {
            System.out.println(10000 + intNums[0] * 1000);
        }
        // 두 번째 조건: 같은 눈이 2개인 경우
        else if (intNums[0] == intNums[1] || intNums[0] == intNums[2] || intNums[1] == intNums[2]) {
            int duplicateNum;
            if (intNums[0] == intNums[1] || intNums[0] == intNums[2]) {
                duplicateNum = intNums[0];
            } else {
                duplicateNum = intNums[1];
            }
            System.out.println(1000 + duplicateNum * 100);
        }
        // 세 번째 조건: 모두 다른 눈이 나오는 경우
        else {
            int maxNum = Math.max(intNums[0], Math.max(intNums[1], intNums[2]));
            System.out.println(maxNum * 100);
        }
    }
}
