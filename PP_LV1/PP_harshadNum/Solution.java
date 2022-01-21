package PP_LV1.PP_harshadNum;

public class Solution {
   
    public boolean solution(int x) {
        boolean answer = true;
        int length = (int)(Math.log10(x));
        int harshadNum=0;
        int temp=x;
        for(int i=length;i>=0;i--){
            harshadNum+=temp/(int)Math.pow(10, i);
            temp=temp%(int)Math.pow(10, i);
        }
        
        if(x%harshadNum!=0){
            answer=false;
        }

        return answer;
    }
    
}
