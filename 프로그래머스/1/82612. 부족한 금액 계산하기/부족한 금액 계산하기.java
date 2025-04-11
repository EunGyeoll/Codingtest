class Solution {
    public long solution(int price, int money, int count) {
        long answer=0;
        
        // 놀이기구 금액은 price*count
        // 놀이기구 count번 타면 얼마가 모자라는지

        long totalPrice=0;
        
        for(int i=1; i<=count; i++) {
            totalPrice = totalPrice + (long) price*i;
        }
        
        answer = totalPrice - money;
        
        if (answer > 0) {
            return answer;
        } else return 0;

    }
}