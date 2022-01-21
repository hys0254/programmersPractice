package PP_LV1.PP_collatzGuess;

public class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num!=1){
            if(num%2==0){
                num/=2;
            }else{
                (long)num=(long)num*3+1;
            }
            System.out.println(num);
            answer++;
        }
        if(answer>=500){
            return -1;
        }else{
            return answer;
        }
    }
}
