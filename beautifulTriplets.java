import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {
        int returnValue = 0;
        List<Integer> elementsList = new ArrayList<>();
        Arrays.stream(arr).forEach(elementsList::add);
         for(int i=0;i<elementsList.size(); i++){
             int iVal = elementsList.get(i);
            int val = iVal + d;
            int val1 = iVal - d;
            System.out.println("i="+i+", iVal="+iVal);
            if(elementsList.contains(val) && elementsList.contains(val1)){
                System.out.println("i="+i+", iVal="+iVal+ ", val="+val + ", val1="+val1);
                int valCount = Collections.frequency(elementsList, val);
                int val1Count = Collections.frequency(elementsList, val1);
                System.out.println(valCount);
                System.out.println(val1Count);
                
                returnValue=returnValue + Integer.max(valCount,val1Count);
            }
            // if(elementsList.contains(val1)){
            //     returnValue++;
            // }
         }

        return returnValue;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
