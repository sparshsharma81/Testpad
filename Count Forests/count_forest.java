// package Count Forests;

public class count_forest {
      private void dfs(char[][] grid, boolean[][] vis, int i , int j ,int m , int n){
        if(i <0 || j < 0 || i>=m || j>=n)return;

        if(grid[i][j] == '0' || vis[i][j])return;

        vis[i][j] = true;
        // if(grid[i][j] == 0)return;
        dfs(grid,vis,i+1,j,m,n);
        dfs(grid,vis,i-1,j,m,n);
        dfs(grid,vis,i,j-1,m,n);
        dfs(grid,vis,i,j+1,m,n);
        
    }
    public int numIslands(char[][] grid) {
        //now we need to return the number of islands...
        //an island is the one which is surrounded by water (0's)
        int m = grid.length;
        int count =0;
        int n = grid[0].length;
        boolean[][] vis= new boolean[m][n];
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j] == '1'){
                    count++;
                    dfs(grid,vis,i,j,m,n);
                }
            }
        }
        return count;

    }
    public static void main(String args[]){
      int[][] grid = {
          {1, 0, 0, 1},
          {0, 1, 0, 0},
          {0, 0, 1, 1},
          {1, 0, 0, 0}
      };
      int n = numIslands(grid);
      System.out.println("Number of islands: " + n);

    }
}
