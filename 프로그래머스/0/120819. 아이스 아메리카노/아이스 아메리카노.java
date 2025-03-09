class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        
        int cof = 5500;
        
        // 최대 잔수, 나머지 돈
        answer[0] = money/cof;
        answer[1] = money%cof;
        
        return answer;
    }
}