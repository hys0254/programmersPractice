package PP_LV2.PP_이진_변환_반복하기;

class Solution {
    public int[] solution(String s) {
        
        int cnt =0;
        int zeroCnt =0;
        
        while(!s.equals("1")){
            String tempS="";
            tempS=s.replaceAll("0","");
            zeroCnt+=s.length()-tempS.length();
            s=convertTwo(tempS.length());
            cnt++;
        }
        int[] answer = {cnt,zeroCnt};
        
        return answer;
    }
    String convertTwo(int i){
        String temp ="";
        while(i!=0){
            temp=i%2+temp;
            i/=2;
        }
        return temp;
    }
}