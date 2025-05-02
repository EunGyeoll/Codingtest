class Solution {
    public int solution(int[] number) {
        // 삼총사를 만들 수 있는 방법의 수 리턴
        int answer = 0;
        
        for(int i=0; i<number.length; i++) {
            for(int j=i+1; j<number.length; j++) {
                for(int k=j+1; k<number.length; k++) {
                    if(number[i]+number[j]+number[k]==0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}