package PP_LV2.PP_전력망을_둘로_나누기;

import java.util.*;
class Solution {
    static List<Integer>[] nodesConnection;
    public int solution(int n, int[][] wires) {
        int answer = -1;
        int minDiff = Integer.MAX_VALUE;
        nodesConnection = new List[n];
        for(int i=0;i<n;i++){
            nodesConnection[i]= new ArrayList<>();
        }
        for(int[] wire : wires){
            nodesConnection[wire[0]-1].add(wire[1]-1);
            nodesConnection[wire[1]-1].add(wire[0]-1);
        }
        // for(int i=0;i<n;i++){
        //     System.out.println(i);
        //     for(int j : nodesConnection[i]){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        for(int[] wire: wires){
            int tempA=findConnectionCnt(wire[0]-1,wire[1]-1,n);
            int tempB=findConnectionCnt(wire[1]-1,wire[0]-1,n);
            minDiff=Math.min(minDiff, Math.abs(tempA-tempB));
        }
        answer=minDiff;
        return answer;
    }
    public int findConnectionCnt(int node,int pass,int n){
        int cnt=0;
        boolean[] check = new boolean[n];
        Queue<Integer> nodeQueue = new LinkedList<Integer>();
        nodeQueue.add(node);
        check[node]= true;
        while(!nodeQueue.isEmpty()){
            int cur= nodeQueue.poll();
            for(int i : nodesConnection[cur]){
                if(i==pass||check[i]) continue;
                nodeQueue.add(i);
                check[i]=true;
                cnt++;
            }
            
        }
        return cnt;
    }
}