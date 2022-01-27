package PP_LV1.PP_year2016;


public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int [] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String [] date ={"THU","FRI","SAT","SUN","MON","TUE","WED"} 
        int day =0;
        for(int i=0;i<a-1;i++){
            day+=month[i];
        }
        day+=b;
        answer=date[day%7];

        return answer;
    }
    
}
