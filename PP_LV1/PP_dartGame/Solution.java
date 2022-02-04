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
                if(strArr[i]=='1'&&strArr[i+1]=='0'){
                    scores[cnt]=10;
                    i++;
                }else{
                scores[cnt]=strArr[i]-'0';
                }
            }else if(strArr[i]=='D'){
                scores[cnt]=(int)Math.pow(scores[cnt], 2);
            }else if(strArr[i]=='T'){
                scores[cnt]=(int)Math.pow(scores[cnt], 3);
            }else if(strArr[i]=='*'){
                if(cnt>0){
                    scores[cnt-1]=2*scores[cnt-1];
                }
                scores[cnt]=2*scores[cnt];
            }else if(strArr[i]=='#'){
                scores[cnt]=scores[cnt]*(-1);
            }
           
        }
        System.out.println("score1 : "+scores[0]+" score2 : "+scores[1]+" score3 : "+scores[2]);
        answer=scores[0]+scores[1]+scores[2];
       
        return answer;
    }
}
