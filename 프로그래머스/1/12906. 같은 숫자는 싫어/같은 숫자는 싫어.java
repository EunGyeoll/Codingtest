import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new ArrayList<>();
       // 숫자는 0~9로 이루어져 있으므로 prev = -1은 처음에 중복이 없는 상태.
        int prev = -1;

        for (int num : arr) {
            if (num != prev) {
                result.add(num);
                // prev 에 값 저장. 이후에 중복 비교를 위해
                prev = num;
            }
        }

        // List를 배열로 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}