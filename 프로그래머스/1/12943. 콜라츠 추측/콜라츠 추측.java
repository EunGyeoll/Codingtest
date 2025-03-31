class Solution {
    public int solution(int num) {
        // 작업을 몇번 바복해야 하는지 반환. 
        // 주어진 수가 1이면 0을, 작업 반복횟수가 500일때도 1이 되지 않으면 -1  반환
        int answer = 0;
        
        long n = num;
        
        // 주어진 수가 1이 될 때까지 다음 작업을 반복
        while(n!=1) {

            if(n%2==0) {
                n = n/2;
                answer++;

            } else if (n%2!=0) {;
                //  num = 3*num+1; 할때 int 범위를 초과하여 오버플로우가 발생할수 있으므로 위에서 num을 long형으로 바꿈
                n = 3*n + 1;
                answer++;
            }        

            if(answer>=500) return -1;


    }
                return answer;
    }
}
