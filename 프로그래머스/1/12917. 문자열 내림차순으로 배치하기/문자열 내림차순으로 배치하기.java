import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        // 문자를 큰거-> 작은거 정렬
        String[] str = s.split("");
        
        Arrays.sort(str, Collections.reverseOrder());

        // String 타입으로 리턴
        for(String r: str) {
            answer+=r;
        }
        
        return answer;
    }
}