import java.util.*;

public class Solution {
    public int solution(int n) {
        
        String strn = Integer.toString(n);
        
        int answer = 0;

        for(int i=0 ; i<strn.length() ;i++) {
            answer+=Integer.parseInt(String.valueOf(strn.charAt(i)));
        }
        
        return answer;
    }
}