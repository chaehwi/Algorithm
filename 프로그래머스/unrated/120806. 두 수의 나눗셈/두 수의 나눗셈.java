class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        
        // 정수 나눗셈은 정수형으로 반환
        answer = (double)num1/num2 * 1000;
        
        return (int)answer;
    }
}