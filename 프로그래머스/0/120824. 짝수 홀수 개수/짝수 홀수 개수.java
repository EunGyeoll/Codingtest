class Solution {
    public int[] solution(int[] num_list) {
        // 짝수의 갯수, 홀수의 갯수
        
        int[] answer = new int[2];
        
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i]%2==0) {
                answer[0]++;
            }
            if(num_list[i]%2==1) {
                answer[1]++;
            }
        }
        
        return answer;
    }
}