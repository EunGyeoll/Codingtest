import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        // num1번째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return
        
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
        // copyOfRange() 메서드는 첫 번째 인덱스를 포함하고 두 번째 인덱스를 포함하지 않기 때문에, num2 대신 num2 + 1을 사용해야 함. copyOfRange메소드의 매개변수 대한 설명은 다음과 같음.
        
        // original – the array from which a range is to be copied
        // from – the initial index of the range to be copied, inclusive(=포함)
        // to – the final index of the range to be copied, exclusive.(=제외)

        return answer;
    }
}