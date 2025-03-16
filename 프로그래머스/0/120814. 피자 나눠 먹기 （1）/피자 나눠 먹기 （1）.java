class Solution {
    public int solution(int n) {
        int answer = 0;
 
        // 필요한 피자 판수는 몫을 올림해야 하는데, 
        // Math.ceil(n/7.0)을 쓰지 않고 (n+6)/7로 구할수 있음. 만약 피자 4판이면 (n+3)/4
        
        answer = (n+6) / 7;
          
        return answer;
      

        
        // if(7%n > 0){
        //     answer=(7/n)+1;
        // }

    }
}