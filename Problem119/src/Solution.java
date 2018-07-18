
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rows = new LinkedList<>();

        for(int rowNum=0;rowNum<=rowIndex;rowNum++){

            for (int i=0;i<=rowNum;i++){
                if(i==0||i==rowNum){
                    rows.add(1);
                }
                else rows.add(rows.get(rows.size()-rowNum)+rows.get(rows.size()-rowNum-1));
            }

        }
     return rows.subList(rows.size()-rowIndex-1,rows.size());
    }

}
