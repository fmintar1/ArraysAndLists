import java.util.ArrayList;
import java.util.Arrays;

public class ArraysAndLists {

    public static void main(String[] args) {
        ArraysAndLists mainObj = new ArraysAndLists();
        mainObj.doArrayAnalysis();
        mainObj.doArrayListAnalysis();
        mainObj.doArrayLoading();
    }

    private void doArrayAnalysis() {

        int[] aa = { 2,3,4,5,6};
        int[] bb = { 10, 4, 6, 2, 13, 18, 5};

        AverageIntArrays avga = new AverageIntArrays();

        int countaa = avga.count(aa);
        int countbb = avga.count(bb);

        int sumaa = avga.sum(aa);
        int sumbb = avga.sum(bb);

        int averageaa = avga.average(aa);
        int averagebb = avga.average(bb);

        System.out.println("AA Count "+countaa+" Sum "+ sumaa+" Avg "+averageaa);
        System.out.println("BB Count "+countbb+" Sum "+ sumbb+" Avg "+averagebb);
    }

    private void doArrayListAnalysis() {

        ArrayList<Integer> aa = new ArrayList<Integer>(Arrays.asList(2,3,4,5,6));
        ArrayList<Integer> bb = new ArrayList<Integer>(Arrays.asList(10, 4, 6, 2, 13, 18, 5));

        AverageIntegerLists avga = new AverageIntegerLists();

        int countaa = avga.count(aa);
        int countbb = avga.count(bb);

        int sumaa = avga.sum(aa);
        int sumbb = avga.sum(bb);

        int averageaa = avga.average(aa);
        int averagebb = avga.average(bb);

        System.out.println("AA Count "+countaa+" Sum "+ sumaa+" Avg "+averageaa);
        System.out.println("BB Count "+countbb+" Sum "+ sumbb+" Avg "+averagebb);
    }

    private void doArrayLoading() {
        // example of how loadIntArrayFromFile can be used.
        LoadAndStore loader = new LoadAndStore();
        int[] cc = loader.loadIntArrayFromFile("./testIntegerData1.txt");

        AverageIntArrays avga = new AverageIntArrays();

        int countcc = avga.count(cc);

        int sumcc = avga.sum(cc);

        int averagecc = avga.average(cc);

        System.out.println("CC Count "+countcc+" Sum "+ sumcc+" Avg "+averagecc);

    }
}
