package PP_LV2.PP_가장_큰_정사각형_찾기_RE;

class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        
        for(int i=1;i<board.length;i++){
            for(int j=1;j<board[0].length;j++){
                if(board[i][j]!=0){
                    board[i][j]=Math.min(Math.min(board[i-1][j-1],board[i-1][j]),board[i][j-1])+1;
                }
                answer=Math.max(answer,board[i][j]);
            }
        }

        return answer*answer;
    }
    
}