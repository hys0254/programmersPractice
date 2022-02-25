package PP_LV2.PP_파일명_정렬;

import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        String[] answer = new String[files.length];
        String[][] fileList = new String[files.length][3];
        for(int i=0; i< files.length;i++){
            int[] sepPoint = new int[2];
            
            finingSeperatePoint(sepPoint, files[i]);
            try{
            
            fileList[i][0]=files[i].substring(0,sepPoint[0]);
            fileList[i][1]=files[i].substring(sepPoint[0], sepPoint[1]);
            fileList[i][2]=files[i].substring(sepPoint[1]);
            }catch(Exception e ){
                System.out.println("point1 : "+sepPoint[0]+"point2 : "+sepPoint[1]);
                System.out.println("ERRRROORRRR!!!");
            }
        }
        Arrays.sort(fileList,new Comparator<String[]>() {
            public int compare(String[] o1, String[] o2){
                if(o1[0].toLowerCase().compareTo(o2[0].toLowerCase())==0){
                   
                    return Integer.parseInt(o1[1])-Integer.parseInt(o2[1]);
                    
                }else{

                    return o1[0].toLowerCase().compareTo(o2[0].toLowerCase());
                }
            }
        });
       
         for(int i=0;i<files.length;i++){
            String temp ="";
            temp+=fileList[i][0]+fileList[i][1]+fileList[i][2];
            answer[i]=temp;
        }
        return answer;
    }
    public void finingSeperatePoint(int[] sepPoint, String file){
        boolean first = false;
        
        for(int i=0; i<file.length();i++){
            if(!first&&('0'<=file.charAt(i)&&'9'>=file.charAt(i))){
                first=true;
                sepPoint[0]=i;
                
            }
            if(first&&(!('0'<=file.charAt(i)&&'9'>=file.charAt(i))||sepPoint[0]+4<i)){
                sepPoint[1]=i;
                return;
            }
            if(i==file.length()-1&&sepPoint[0]+4>=i){
                sepPoint[1]=i+1;
            }
        }
        

    }
}