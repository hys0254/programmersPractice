package PP_LV1.PP_dartGame;

public class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        char[] strArr= dartResult.toCharArray();
        int scores[] = new int[3]; 
        int cnt = -1;
        for(int i =0; i<strArr.length;i++){
            if(strArr[i]>='0'&&strArr[i]<='9'){
                cnt++;
                if(strArr[i]=='1'&&strArr[i]=='0'){
                    scores[cnt]=10;
                    i++;
                }
                scores[cnt]=strArr[i];
            }else if(strArr[i]=='D'){
                scores[cnt]=Math.pow(scores[cnt], 2);
            }else if(strArr[i]=='T'){
                
            }else if(strArr[i]=='*'){
                if(cnt==0){

                }
                answer+=
            }else if(strArr[i]=='#'){
                
            }
           
        }
        
       
        return answer;
    }
}
