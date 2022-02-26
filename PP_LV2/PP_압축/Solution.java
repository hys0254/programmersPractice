package PP_LV2.PP_압축;
import java.util.*;

import PP_LV1.PP_sumBtwTwoInt.solution;
class Solution {
    static public int[] solution(String msg) {
        int[] answer = {};
        String[] tempStr = new String[26];
        for(int i = 0 ; i< 26; i++){
            tempStr[i]= (char)('A'+i)+"";
        }
        ArrayList<Integer> answerList = new ArrayList<>();
        ArrayList<String> dictionary = new ArrayList<>(Arrays.asList(tempStr));

        boolean flag =true;
        int tempCnt =0;
        while(flag){
            String temp = msg.charAt(tempCnt)+"";
            String printStr ="";
            while(dictionary.indexOf(temp)!=-1){
                printStr =temp;
                if(tempCnt==msg.length()-1){
                    flag=false;    
                    break;
                }
                temp+=msg.charAt(tempCnt+1);
                tempCnt++;
            }
            answerList.add(dictionary.indexOf(printStr)+1);
            if(dictionary.indexOf(temp)==-1)dictionary.add(temp);
            
        }
        //KAKAO






        for(int i =0; i<msg.length();i++){
            String temp = msg.charAt(i)+"";
            String printStr =msg.charAt(i)+"";
            int tempCnt =i;

            while(dictionary.indexOf(temp)!=-1){
                temp+=msg.charAt(tempCnt+1)+"";
                printStr+=msg.charAt(tempCnt)+"";
                tempCnt++;
            }
            i=tempCnt;
            answerList.add(dictionary.indexOf(printStr)+1);
            dictionary.add(temp);
        }
        answer= new int[answerList.size()];
        for(int i =0; i<answerList.size();i++){
            answer[i]=answerList.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        String q = "KAKAO";
        for(int i : solution(q)){
            System.out.println(i);
        }
    }
}
