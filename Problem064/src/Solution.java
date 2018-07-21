public class Solution {
    public int minPathSum(int[][] grid) {
        for ( int row=0;row<grid.length;row++){
            for ( int column=0;column<grid[row].length;column++){
                if (row==0&&column!=0)grid[row][column]+=grid[row][column-1];
                if (row!=0&&column==0)grid[row][column]+=grid[row-1][column];
                if (row!=0&&column!=0)grid[row][column]+=Math.min(grid[row][column-1],grid[row-1][column]);
            }
        }
        return grid[grid.length-1][grid[0].length];
    }
}
