package PP_LV1.PP_strangeWord;

public class Solution {



    // public String solution(String s) {
    //     String answer = "";
    //     String wordArr[]=s.split(" ");
        
    //     for(int i=0;i<wordArr.length;i++){
    //         for(int j=0;j<wordArr[i].length();j++){
    //             if(j%2==0){
    //                 answer+=Character.toUpperCase(wordArr[i].charAt(j));
    //             }else{
    //                 answer+=Character.toLowerCase(wordArr[i].charAt(j));
    //             }
    //         }
    //         if(i==wordArr.length-1&&s.charAt(s.length()-1)!=' '){
    //             break;
    //         }else{
    //             answer+=" ";
    //         }
            
    //     }
    //     if(answer.length()!=s.length()){
    //         for(int i=0; i<s.length()-answer.length();i++){
    //             answer+=" ";
    //         }
    //     }
    //     return answer;
    // }

    public String solution(String s) {
        String answer = "";
        int cnt =0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)==' '){
                answer+=s.charAt(i);
                cnt=0;
                continue;
            }

            if(cnt%2==0){
                answer+=Character.toUpperCase(s.charAt(i));
            }else{
                answer+=Character.toLowerCase(s.charAt(i));
            }
            cnt++;
        }
        return answer;
    }

    // string solution(string s) {
    //     string answer = "";
        
    //     int nCount = 1;
        
    //     for(int i = 0; i < s.size(); i++, nCount++){
            
    //         if(s[i] == ' '){
    //             answer += ' ';
    //             nCount = 0;
    //         }
            
    //         else
    //             nCount & 1 ? answer += toupper(s[i]) : answer += tolower(s[i]); 
    //     }
        
    //     return answer;
    // }

}
