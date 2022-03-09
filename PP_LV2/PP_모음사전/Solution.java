package PP_LV2.PP_모음사전;

class Solution {
    static int cnt =0;
    static String[] letter = {"A","E","I","O","U"};
    static boolean check = false;
    static String target = "";
    public int solution(String word) {
        target=word;
        int answer = 0;
        String temp ="";
        for(String s : letter ){
            findingIdx(temp+s);
        }
        answer=cnt;
        return answer;
    }
    public void findingIdx(String temp){
        if(check) return;
        cnt++;
        if(temp.equals(target)){
            check=true;
            return;
        }
        if(temp.length()==5){
            return;
        }
        for(String s: letter){
            findingIdx(temp+s);
        }
    }
}
