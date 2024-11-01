import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nums = scanner.nextLine();
        String[] strNumArr = nums.split(" ");

        int[] intNumArr = new int[strNumArr.length];
        for (int i = 0; i < strNumArr.length; i++) {
            intNumArr[i] = Integer.parseInt(strNumArr[i]);
        }

        if (intNumArr[0]>intNumArr[1]) {
            System.out.println(">");
        } else if (intNumArr[0]<intNumArr[1]) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

