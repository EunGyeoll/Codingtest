import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        // 문자열 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열을 특정 기준으로 구분
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()); // charAt은 문자열만 가능하므로 안 됨.
            int b = Integer.parseInt(st.nextToken());

            if(a==0 && b==0) {
                break;
            };

            sb.append(a+b).append("\n");
        }

        System.out.println(sb);

    }
}

