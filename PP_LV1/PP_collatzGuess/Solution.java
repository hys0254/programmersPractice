package PP_LV1.PP_collatzGuess;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = (long) num;
        while(temp!=1){
            if(temp%2==0){
                temp/=2;
            }else{
                temp=temp*3+1;
            }
            answer++;
        }
        if(answer>=500){
            return -1;
        }else{
            return answer;
        }
    }
}
