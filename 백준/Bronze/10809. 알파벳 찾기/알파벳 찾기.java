import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // 입력받은 단어 S
            String S = sc.next();

            // 출력할 것: 26개 알파벳들이 문자열 S에 해당하는 위치.
            int[] arr= new int[26];

            // -1 로 초기화. 포함되지 않은 알파벳은 -1로 출력해야 하기에.
            for(int i=0; i<arr.length; i++) {
                arr[i] = -1;
            }

            for(int i=0; i<S.length(); i++) {
                // 단어의 문자값에 해당하는 인코딩값을 -97 또는 -'a' 하여 인덱스를 맞춰준다.
                int index = S.charAt(i) - 'a';

                if(arr[index] == -1) {
                    // 어떤 문자가 처음 등장하면 그때만 위치를 저장.
                    // ch=b면 arr[1]=0, ch=a면 arr[0]=1, ch=e면 arr[4]=3
                    arr[index] = i; //원래
                }
                // -1이 맞다면 처음 등장한 알파벳이므로 위치값을 저장.
            }

            for (int a : arr){
                System.out.print(a + " ");
            }

            sc.close();
        }
}
