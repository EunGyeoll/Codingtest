import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num = Integer.parseInt(br.readLine());

    // 첫번째와 마지막 자리 출력
    for (int i = 0; i < num; i++) {
        String str = br.readLine();
        String[] strarr = str.split("");

        System.out.println(strarr[0] + strarr[strarr.length - 1]);

    }



    }

}
