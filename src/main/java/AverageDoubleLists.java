import java.util.ArrayList;

public class AverageDoubleLists {

    // write out these too
    public Double count(ArrayList<Double> aa) {
        return Double.valueOf(aa.size());
    }
    public Double sum(ArrayList<Double> aa) {
        double result = 0.0;
        for(int i = 0; i < aa.size(); i++) {
            result+=aa.get(i);
        }
        return result;
    }
    public Double average(ArrayList<Double> aa) {
        double result = 0.0;
        for(int i = 0; i < aa.size(); i++) {
            result+=aa.get(i);
        }
        return result/ aa.size();
    }

}
