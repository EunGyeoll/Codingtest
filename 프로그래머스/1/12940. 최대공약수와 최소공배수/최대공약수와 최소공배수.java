class Solution {
    public int[] solution(int a, int b) {
        int max = 0;
        int[] answer = new int[2];
        
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                max = i;
            }
        }
        
        // 최대공약수
        answer[0] = max;
        
        // 최소공배수
        answer[1] = (a * b) / max;
        
        return answer;
    }
}