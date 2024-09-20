import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

       String nums[] =  bf.readLine().split(" ");

       long A = Long.parseLong(nums[0]);
       long B = Long.parseLong(nums[1]);
       long C = Long.parseLong(nums[2]);

        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C );
        System.out.println((A*B)%C);
        System.out.println( ((A%C) * (B%C))%C);

    }
}