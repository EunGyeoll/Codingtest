import java.util.Arrays;

class Solution {
    public long solution(long n) {
        
        char[] charN = String.valueOf(n).toCharArray();
        Arrays.sort(charN); // 일단 오름차순으로 정렬하기
        StringBuilder sb = new StringBuilder(new String(charN));
                
        return Long.parseLong(sb.reverse().toString());
        
        // char[] 사용 이유: toCharArray(), Arrays.sort() 를 사용 가능
        // String[] 타입 사용하면 split("")으로 String[] 변환, String.join("", arr) 로 다시 문자열을 합쳐야 함.

    }
}