package PP_LV1.PP_secretMap;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i =0 ; i<n;i++){
            String answerTemp="";
            
            String temp1=Integer.toBinaryString(arr1[i]);
            String temp2=Integer.toBinaryString(arr2[i]);
            int temp1Length = temp1.length();
            int temp2Length = temp2.length();
            if(temp1Length<n){
                for(int j=0; j<n-temp1Length;j++){
                    temp1="0"+temp1;
                }
            }
            
            if(temp2Length<n){
                for(int j=0; j<n-temp2Length;j++){
                    temp2="0"+temp2;
                }
            }
            System.out.println("After plus 0 arr1 : "+ temp1);
            System.out.println("After plus 0 arr2 : "+ temp2);
            for(int j=0;j<n;j++){
                if(temp1.charAt(j)=='1'||temp2.charAt(j)=='1'){
                    answerTemp+="#";
                }else if(temp1.charAt(j)=='0'&&temp2.charAt(j)=='0'){
                    answerTemp+=" ";
                }
            }
            answer[i]=answerTemp;

        }

        return answer;
    }
}
