package PP_LV1.PP_calculateLackMoney;

public class Solution {
    public double solution(int price, int money, int count) {
        double answer =0;
          
        for (int i = 1; i <= count; i++) {
            answer += (double)(i * price);
            
        }
       System.out.println(answer);
        answer-=(double)money;
         if(answer<0){ 
            answer=0;
        }
        return answer;
    }
}
