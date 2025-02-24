import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		String a = in.next();
		in.close();
		
		int sum = 0;
        
		for(int i = 0; i < N; i++) {
			sum += a.charAt(i)-'0';
            // charAt() 은 문자의 아스키코드 값을 반환하므로 반드시 -48 또는 -'0' 을 해야 입력받은 숫자 값 그대로를 사용할 수 있다.
		}
		System.out.print(sum);
	}
}
 