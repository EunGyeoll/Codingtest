class Solution {
    public int solution(int[] numbers) {
        int sumOfZeroToNine = 45;
        
        int sum = 0;
        
        for (int i: numbers) {
            sum += i; 
        }
        

        return 45-sum;
    }
}