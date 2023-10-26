class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n);
        
        int[] strArr = new int[str.length()];
        
        for(int i=0; i < str.length(); i++){
            strArr[i] = str.charAt(i) - '0'; 
        }
        
        for(int i=0; i < strArr.length; i++){
            answer += strArr[i]; 
        }
        
        return answer;
    }
}