import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here

int n = a.size();  
int swap;
        for (int c = 0; c < (n - 1); c++) {
        for (int d = 0; d < n - c - 1; d++) {
            if (a.get(d) > a.get(d + 1)) {
                swap = a.get(d);
                a.set(d, a.get(d + 1));
                a.set(d + 1, swap);
            }
        }
    }
    System.out.println("Array is sorted in 0 swaps.");
    for(int i=0; i<n; i++){
        if(i==0){
        System.out.println("First Element: " + a.get(i));
        }
        else if(i ==n-1){
        System.out.println("Last Element: " + a.get(i));
        }
        else{
            continue;
        }
    }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countSwaps(a);

        bufferedReader.close();
    }
}
