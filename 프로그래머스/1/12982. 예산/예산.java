import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        // 최대한 많은 부서를 지원하기 위해 오름차순 정렬
        Arrays.sort(d);
        
        for(int i=0; i< d.length; i++) {
            if(d[i] <= budget) {
                // 금액이 예산보다 작거나 같으면 지원함. 지원할때마다 예산은 줄어듬.
                budget = budget - d[i];
                // 부서 지원할 때마다 +1
                answer++;
            } else {
                // 예산 부족할 경우 중단
                break;
            }
        }
        
        return answer;
        
//         오름차순 정렬 하는 이유: 예를 들어
//         int[] d = {5, 4, 3, 2, 1};
//         int budget = 9;
//         정렬 안 하면: 5 + 4 = 9 → 2개 부서
//         정렬하면: 1 + 2 + 3 = 6 → 3개 부서 지원 가능
    }
}