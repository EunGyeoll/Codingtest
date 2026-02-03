import java.util.Arrays;

class Solution {
    public long solution(long n) {
        // 숫자열 n을 문자로 전환
        String s = String.valueOf(n);
        // 문자를 문자열로 전환
        char[] charA = s.toCharArray();
        
        // 배열 단계에서 정렬해야 함.
        // char[] 단계에서는 정렬 가능하고, StringBuilder 단계에서는 뒤집기 가능.
        Arrays.sort(charA);
        
        // String st = String.valueOf(charA);도 가능
        String st = new String(charA);
        
        // 가변 객체인 StringBuilder 로 바꿈
        StringBuilder sb = new StringBuilder(st);

        // StringBuilder에서 reverse 가능
        sb.reverse();
        
        // 문자열을 담은 객체인 StringBuilder sb를 문자열로 변환
        String stt = sb.toString();
        
        // String을 long으로
        long answer = Long.parseLong(stt);
        
        
        return answer;
    }
}