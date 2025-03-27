class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i]<=9) {
                sum+=numbers[i];
            }
        }
        

        return 45-sum;
    }
}