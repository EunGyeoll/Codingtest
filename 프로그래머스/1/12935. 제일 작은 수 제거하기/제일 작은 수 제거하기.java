import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        
        // 최소값 구하기
        int min = Arrays.stream(arr).min().getAsInt();
        
        // 최소값 제외한 배열 반환
        return Arrays.stream(arr).filter(x -> x != min).toArray();
        
    }
}