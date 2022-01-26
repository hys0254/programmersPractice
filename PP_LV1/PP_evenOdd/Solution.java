package PP_LV1.PP_evenOdd;

public class Solution {
    public String solution(int num) {
        String answer ;
        answer= num%2==0 ? "Even" : "Odd"; 
        return answer;
    }
}
//1이랑 비트연산하면 판별가능