import java.util.ArrayList;

public class AverageIntegerLists {


    public int count(ArrayList<Integer> aa) {
        return aa.size();
    }

    public int sum(ArrayList<Integer> aa) {
        int result = 0;
        for(int i = 0; i < aa.size(); i++) {
            result+=aa.get(i);
        }
        return result;
    }

    public int average(ArrayList<Integer> aa) {
        int result = 0;
        if(aa.size() == 0) {
            return result;
        }
        for(int i = 0; i < aa.size(); i++) {
            result+=aa.get(i);
        }
        return result/aa.size();
    }
}
