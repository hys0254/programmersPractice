package PP_LV2.PP_카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int temp =-1;
        for(int i=2;i<(brown/2)/2+1;i++){
            if((i-1)*(brown/2-(i)-1)==yellow){
                temp=i;
                break;
            } 
        }
        answer[0]=Math.max(brown/2-temp+1,temp+1);
        answer[1]=Math.min(brown/2-temp+1,temp+1);
        return answer;
    }
}