import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // String str = Integer.toString(n);
        // int[] arrNum = new int[str.length()];
        
        // for(int i=0; i<str.length(); i++){
        //    arrNum[i] = str.charAt(i) - '0';
        // }
        
        // for(int i=0; i<arrNum.length; i++){
        //    answer += arrNum[i];
        // }
        
        while(n != 0){
            answer += n%10;
            n = n/10;
        }


        return answer;
    }
}