package PP_LV2.PP_n^2_배열_자르기;

class Solution {
    public int[] solution(int n, long left, long right) {
        int answerCnt = (int)(right-left)+1;
        int[] answer = new int[answerCnt];
        
        int cnt =0;
        while(!(left>right)){
            int x = (int)(left/n);
            int y = (int)(left%n);
            answer[cnt]= Math.max(x,y)+1;
            cnt++;
            left+=1;
        }
        
        return answer;
    }
}