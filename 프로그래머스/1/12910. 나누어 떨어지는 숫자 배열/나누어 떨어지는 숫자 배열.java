import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        Arrays.sort(arr);
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                count++;
            }
        }
        
        if (count == 0) {
            return new int[]{-1};
        }
        
        int[] answer = new int[count];
        int answerIdx = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[answerIdx] = arr[i];
                answerIdx++;
            }
        }
        
       
        
        return answer;
    }
}