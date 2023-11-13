class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] strArr = s.split(" ");
        
        int max = Integer.parseInt(strArr[0]);
        int min = Integer.parseInt(strArr[0]);
        
        for(int i = 0; i < strArr.length; i++){
            max = Math.max(max,Integer.parseInt(strArr[i]));
            min = Math.min(min,Integer.parseInt(strArr[i]));
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}