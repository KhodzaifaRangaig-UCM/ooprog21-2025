public class PreviousAverage {

    public static void main (String [] a) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(GreaterThanAverage(responseTimes));
    }
    public static int GreaterThanAverage (int[] arr) {
        int count = 0;
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double average = sum / i;
            if (arr[i] > average) {
                count++;
            }
            sum = sum + arr[i];
        }
        return count;
    }
    
}
