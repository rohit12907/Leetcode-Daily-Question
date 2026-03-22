class Solution {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int t[][] =  new int [c][r];
        for(int i = 0 ; r>i;i++){
            for(int j = 0 ; c>j;j++){
                t [j][i]= matrix[i][j];
            
            }
        }
        return t ;
        
    }
}