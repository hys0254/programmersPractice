package PP_LV1.PP_hidePhoneNum;

public class Solution {
    public String solution(String phone_number) {
        int phone_number_length = phone_number.length();
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i=0;i<phone_number_length;i++){
            if(i>=phone_number_length-4){
                sb.append(phone_number.charAt(i));
            }else{
            sb.append('*');
            }
        }
        answer=sb.toString();
        return answer;
    }


    // public String solution(String phone_number) {
    //     StringBuilder sb = new StringBuilder();
    //     for(int i=0; i<phone_number.length()-4;i++){
    //         sb.append("*");
    //     }
    //     sb.append(phone_number.substring(phone_number.length()-4,phone_number.length()));
    //     return sb.toString();
    // }
}
