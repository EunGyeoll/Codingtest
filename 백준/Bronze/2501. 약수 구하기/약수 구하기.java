    import java.util.Scanner;

    public class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                // 출력할 것: N의 약수 중 K번째로 작은 수
                int N = sc.nextInt();
                int K = sc.nextInt();

//                // p의 약수를 담은 배열 arr
//                int[] arr = new int[N];

                // 약수의 갯수
                int count=0;


                // N/i==0 이면 i는 N의 약수. i들 중 K번째로
                for(int i = 1; i <= N; i++) {
                    if(N%i==0) {
                        count++;

                        if(count==K) {
                            System.out.println(i);
                            return;
                        }
                    }

                    // 여기 안에서 count<K인 경우를 처리하면 안됨
                }

                System.out.println("0");

            }

    }
