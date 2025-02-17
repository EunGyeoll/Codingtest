class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for (int x : arr) {
            sum += x;
        }
        
        answer = sum/arr.length; //double 에 int를 나누면 값이 double로 나옴
        return answer;
    }
}