import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        // 같은 원소의 갯수 리턴
        int answer = 0;

        // Hashset 배열 만들기
        Set<String> set1 = new HashSet<>();
        
        for(String str:s1) {
            set1.add(str);
        }
        
        for(String str2: s2) {
            if(set1.contains(str2)) { // Set, List 에서는 equals() 아니고 contains
                answer++;
            }
        }

        return answer;
    }
}