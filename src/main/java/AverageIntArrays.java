public class AverageIntArrays {

// Complete these methods

    public int count(int[] aa) {
        return aa.length;
    }

    public int sum(int[] aa) {
        int total = 0;

        //Create a loop to read through all array values
        for(int i = 0; i < aa.length; i++) {

            //For every loop, add array values to total
            total+=aa[i];
        }
        return total;
    }

    public int average(int[] aa) {
        int total = 0;

        //When there's no value in the array
        if(aa.length == 0) {
            return 0;
        }
        //Create a loop to read through all array values
        for(int i = 0; i < aa.length; i++) {

            //For every loop, add array values to total
            total += aa[i];

        }
        System.out.println(total);

        //Return total divided by the length of the array
        return total/aa.length;
    }

}
