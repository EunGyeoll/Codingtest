class Solution {
    public long solution(long n) {
        long sq = (long) Math.sqrt(n);
        
        if(sq*sq==n){
            return (sq+1)*(sq+1);
        } else {
            return -1;
        }
    }
}