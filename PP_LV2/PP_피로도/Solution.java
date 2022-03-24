package PP_LV2.PP_피로도;

import PP_LV1.PP_sumBtwTwoInt.solution;

class Solution {
    static int answer = Integer.MIN_VALUE;
    static int[][]dun ;
    static boolean[] check;
    static public int solution(int k, int[][] dungeons) {
        dun=dungeons;
        check= new boolean[dungeons.length];
        
        dfs(k,0);
        return answer;
    }
    static void dfs(int k,int cnt){
            System.out.println("cnt : "+cnt);
            answer=Math.max(answer,cnt);
            System.out.println(answer);
        for(int i=0;i<dun.length;i++){
            if(check[i]) continue;
            if(k>=dun[i][0]){
                check[i]=true;
                System.out.println("in : " +i);
                dfs(k-dun[i][1],cnt+1);
                System.out.println("out : " +i);
                check[i]=false;
            }
        }
        
        return;
    }
    public static void main(String[] args) {
        int[][] d={{80,20},{50,40},{30,10}};
        System.out.println(solution(80,d));
    }
}
