import java.util.ArrayList;
import java.util.List;

public class MyCalendar {

    List<int[]> calenar;

    public MyCalendar() {
        calenar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] date : calenar) {
            if (date[0] < end && date[1] > start) {
                return false;
            }
        }
        calenar.add(new int[]{start, end});
        return true;
    }
}
