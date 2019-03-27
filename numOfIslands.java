public class Solution {
    public int numIslands(char[][] grid) {
       int counter = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                if(grid[i][j] == '1'){
                    islandExplorer(grid, i, j);
                    counter++;
                }
            }
        }
        return counter;
    }
    
    private void islandExplorer(char[][] grid, int i, int j){
        if(i < 0 || j < 0 || i>= grid.length || j>= grid[i].length || grid[i][j] != '1'){
            return;
        }
        //sinking the location of the island so we don't go back to it
        grid[i][j] = '0';
        
        //explore the entire island, when we are finished we go back and count the island
        islandExplorer(grid, i+1, j);
        islandExplorer(grid, i-1, j);
        islandExplorer(grid, i, j+1);
        islandExplorer(grid, i, j-1);
            
    }
}