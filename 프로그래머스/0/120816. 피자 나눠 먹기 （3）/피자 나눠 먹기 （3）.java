import java.lang.Math;

class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        // slice조각을 n명이 한조각 이상 먹도록 하려면 몇 판 시켜야 하는지
        
        // Math.ceil은 double 타입을 반환함.
        // n과 slice 중 하나를 double로 변환하고 ceil로 올림한 뒤 그 결과를 int 로 변환
        answer = (int) Math.ceil( (double) n/slice );
        
        return answer;
    }
}