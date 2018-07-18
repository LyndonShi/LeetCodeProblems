class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length-1;
        int column=matrix[row].length-1;

        for (int i=0;i<row/2+1;i++){
            for (int j=i;j<column-i;j++){//the end point of each edge of every frame rotated only once!
                int E1=matrix[i][j];
                int E2=matrix[j][column-i];
                int E3=matrix[column-i][column-j];
                int E4=matrix[column-j][i];

                matrix[j][column-i]=E1;
                matrix[column-i][column-j]=E2;
                matrix[column-j][i]=E3;
                matrix[i][j]=E4;
            }
        }
    }
}