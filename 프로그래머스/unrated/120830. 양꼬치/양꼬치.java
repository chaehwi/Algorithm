class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 서비스 음료수
        // 10의 배수의 개수
        int plus_k = 0;
        
        // n 이 10의 배수가 될 때 마다 plus_k 가 1씩 늘어남
        for(int i = 1; i <= n; i++){
            if(i % 10 == 0){
                plus_k++;
            }
        }
        
        answer = (n*12000) + (k*2000) - (plus_k*2000);
        
        return answer;
    }
}