public class AverageDoubleArrays {


// Complete these methods

    public int count(double[] aa) {
        return aa.length;
    }

    public double sum(double[] aa) {
        double result = 0.0;
        //Create a loop to read through array values
        for(int i = 0; i < aa.length; i++) {

            //Sum all arrays to result
            result+=aa[i];
        }
        //return result
        return result;
    }

    public double average(double[] aa) {
        double result = 0.0;

        //If no value, return 0
        if(aa.length == 0) {
            return 0;
        }
        //Create loop to read through array values
        for(int i = 0; i < aa.length; i++) {
            result+=aa[i];
        }
        //return result divided by length of array
        return result/aa.length;
    }

}
