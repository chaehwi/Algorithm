import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] strArr = String.valueOf(n).split("");
        
        Arrays.sort(strArr);;
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArr){
            sb.append(str);
        }
        
        answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}