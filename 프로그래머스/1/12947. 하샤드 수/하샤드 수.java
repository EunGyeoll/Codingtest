class Solution {
    public boolean solution(int x) {
        
        String[] num = Integer.toString(x).split("");
        int sum = 0;

        boolean answer = false;
        
        for(int i=0; i<num.length; i++) {
          sum += Integer.parseInt(num[i]);
            if(x%sum==0) {
                answer= true;
            } else{
                answer= false;
            }
        }
        
        return answer;
    }
}