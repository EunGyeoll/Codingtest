import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

       Scanner sc = new Scanner(System.in);

       String A = sc.nextLine();
       String B = sc.nextLine();

       // A를 정수형으로 변환
       int intA = Integer.parseInt(A);

       // B의 뒷자리 숫자부터 곱해야 하므로 뒤집은 후
       StringBuffer sb = new StringBuffer(B);
       String reversedB = sb.reverse().toString();

       // 뒤집은 B를 자릿수로 쪼갠다.
       String[] eachNums = reversedB.split("");

//       역순으로 잘 쪼개졌는지 확인
//       System.out.println(Arrays.toString(eachNums));

       // B는 여전히 문자이니 숫자로 바꾸어 곱한다.
       for(String digit : eachNums) {
           int intB = Integer.parseInt(digit);
           System.out.println(intA * intB);
       }

       // 곱셈값
        System.out.println(intA * Integer.parseInt(B));

       sc.close();

    }
}