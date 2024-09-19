import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nums = br.readLine().split(" ");

        long A = Long.parseLong(nums[0]);
        long B = Long.parseLong(nums[1]);
        long C = Long.parseLong(nums[2]);

        System.out.print(A+B+C);

    }
}