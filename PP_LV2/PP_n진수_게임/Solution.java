package PP_LV2.PP_n진수_게임;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String tempString="";
        int numToConvert=0;
        while(true){
            tempString+=getConvertN(numToConvert, n);
            while(tempString.length()>=m){
                answer+=tempString.charAt(p-1);
                
                if(answer.length()==t){
                    return answer;
                }
                tempString=tempString.substring(m);
            }
            numToConvert++;
        }
        
    }
    static public String getConvertN (int num, int n){
        String result ="";
        if( num ==0){
            return "0";
        }

        while(num!=0){
            int share = num/n;
            int remain = num%n;
            if(remain>9){
                result=(char)((remain-10)+'A')+result;
            }else{
                result=remain+result;
            }
            num=share;
        }
        return result;
    }
}