public class Solution {
    public int islandPerimeter(int[][] grid) {
        int island = 0;
        int neighbor = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (grid[row][column] == 1) {

                    island++;
                    if (row<grid.length-1&&grid[row+1][column]==1)neighbor++;
                    if (column<grid[row].length-1&&grid[row][column+1]==1)neighbor++;
                }
            }
        }
        return island*4-neighbor*2;
    }
}
