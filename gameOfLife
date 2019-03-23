class Solution {
    public void gameOfLife(int[][] board) {
        int[][] initialBoard = new int[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                initialBoard[i][j] = board[i][j];
            }
        }
    for(int i = 0; i < board.length; i++){
        for(int j = 0; j < board[i].length; j++){
            int livingNeighbors = getLivingNeighbors(initialBoard, i, j);
            
            
            if(initialBoard[i][j] ==1){
                if (livingNeighbors<2 || livingNeighbors >3){
                    board[i][j] = 0;
                }
            }
            
            if(initialBoard[i][j] == 0){
                if(livingNeighbors ==3){
                    board[i][j] = 1;
                }
            }
            
        }
    }
        
    }
    
    private int getLivingNeighbors(int[][] board, int i, int j){
        
        
        int livingNeighbors = 0;
        //checking left neighbor
        if(j-1 >= 0){
        if(board[i][j-1] == 1){
            livingNeighbors++;
        }
        }
        //checking right neighbor
        if(j+1 < board[i].length){
        if(board[i][j+1] == 1){
            livingNeighbors++;
        }
        }
        //checking top neighbor
        if(i-1 >= 0){
        if(board[i-1][j] == 1){
            livingNeighbors++;
        }
        }
        //checking bottom neighbor
        if(i+1 < board.length){
        if(board[i+1][j] == 1){
            livingNeighbors++;
        }
        }
        //checking top left neighbor
        if(i-1 >= 0 && j-1 >=0){
        if(board[i-1][j-1] == 1){
            livingNeighbors++;
        }
        }
        //checking top right neighbor
        if(i-1 >= 0 && j+1 < board[i].length){
        if(board[i-1][j+1] == 1){
            livingNeighbors++;
        }
        }
        //checking bottom left neighbor
        if(i+1 < board.length && j-1 >= 0){
        if(board[i+1][j-1] == 1){
            livingNeighbors++;
        }
        }
        //checking bottom right neighbor
        if(i+1 < board.length && j+1 < board[i].length){
        if(board[i+1][j+1] == 1){
            livingNeighbors++;
        }
        }
        return livingNeighbors;
    }    
}
