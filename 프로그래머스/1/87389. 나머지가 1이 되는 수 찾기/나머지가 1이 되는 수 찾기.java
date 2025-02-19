class Solution {
    public int solution(int n) {

        for(int x=2; x<n; x++) {
           if(n%x==1) {
                return x;
           }
       }
         return -1; //  모든 경우에 리턴값이 있어야 하므로 컴파일 오류 방지를 위해 추가 필요
    }
}