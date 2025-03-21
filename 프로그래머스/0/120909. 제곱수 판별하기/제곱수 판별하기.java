class Solution {
    public int solution(int n) {
        // 제곱근을 구해서 정수인지 확인
        double sqrt = Math.sqrt(n);
        
        // 정수면 1, 아니면 2 반환
        return (sqrt%1==0)? 1: 2;
    }
}