class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int count=0;
        
        // 숫자끼리 비교해야 하는데 String으로 주어졌으므로 숫자로 바꾸는데 int 는 18자리까지 담지 못하므로 long에 담음
        long numP = Long.parseLong(p);
        
        // i의 최대값을 t.length() - p.length()까지로 해야 t.length()까지만 가서 범위 오류 발생하지 않음.
        for(int i=0; i<= t.length()-p.length(); i++) {
            long trimmedNumT = Long.parseLong(t.substring(i, i + p.length()));
            if (trimmedNumT <= numP) count++;
        }
        
        
        return count;
     }
}