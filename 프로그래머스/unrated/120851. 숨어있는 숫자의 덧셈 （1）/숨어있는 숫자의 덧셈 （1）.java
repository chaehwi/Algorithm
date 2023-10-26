class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]","");
        String[] strArr = my_string.split("");
        
        for(int i=0; i < strArr.length; i++){
            answer += Integer.parseInt(strArr[i]);
        }
        
        return answer;
    }
}