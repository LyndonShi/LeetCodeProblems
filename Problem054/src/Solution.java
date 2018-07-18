import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix.length == 0) return result;
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int a = 0;
        int b = n;
        int c = 0;
        int d = m;

        while (a <= b && c <= d) {
            for (int i = a; i <= b; i++)
                result.add(matrix[c][i]);
            for (int i = c + 1; i <= d; i++)
                result.add(matrix[i][b]);
            if (a < b && c < d) {
                for (int i = b - 1; i > a; i--)
                    result.add(matrix[d][i]);
                for (int i = d ; i > c; i--)
                    result.add(matrix[i][a]);
            }
            a++;
            b--;
            c++;
            d--;
        }
        return result;
    }
}
