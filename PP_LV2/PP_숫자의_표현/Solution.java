package PP_LV2.PP_숫자의_표현;

class Solution {
    static int ansCnt =0;
    static int targetN;
    static boolean isConstant =false;
    public int solution(int n) {
        
        targetN = n;
        dfs(1,0,false);
        int answer = ansCnt;
        return answer;
    }
    
    static public void dfs(int i, int sum, boolean isConstant){
        if(i>targetN ||sum >= targetN){
            if(sum==targetN){
                ansCnt ++;
            }
            return;
        }
        
        //이전까지 숫자를 더해오던 경우
        //탈출 조건에 걸리지 않는 한 현재수를 무조건 더해야됨
        //더 한 후 해당케이스가 종료될 경우 재 사용 불가.
        if(isConstant){
            dfs(i+1,sum+i,true);
            return;
        }
        //이전까지 숫자를 안더해오던 경우 
        //지금부터 더하는 경우와 안더하는 경우 존재
        dfs(i+1, sum+i, true);
        dfs(i+1, sum, false);
        
        
        return;
    }
}