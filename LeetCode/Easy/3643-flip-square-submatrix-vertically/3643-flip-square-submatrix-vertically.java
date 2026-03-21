class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int sr = x ;
        int er = sr + k -1 ;
        int sc = y ;
        int ec = sc + k -1 ;
        
        for(int i = sr ; er>=i;i++){
            for(int j = sc; ec>=j;j++){
                int temp = grid[i][j];
                  temp = grid[i][j];
                grid[i][j] = grid[er][j];
                grid[er][j] = temp ;
            }
            er--;
        }
        return grid ;
        
    }
}