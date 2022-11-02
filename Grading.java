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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    
    
    //my code start to
    
    ArrayList<Integer> arrlist = new ArrayList<Integer>();
    int mult5 =0;
    for (int counter = 0; counter < grades.size(); counter++) { 
        if(grades.get(counter)<38){
        arrlist.add(grades.get(counter));
        }
        else{
            for(int i= grades.get(counter); i<grades.get(counter)+4;i++){
                if(i%5 == 0){
                    mult5 =i;
                    break;
                }
                else{
                    continue;
                }
            }
            if((mult5-grades.get(counter)<3)){
              arrlist.add(mult5);  
            }
            else{
               arrlist.add(grades.get(counter)); 
            }
            
        }                    
      }   
    for (int counter = 0; counter < grades.size(); counter++) {             
          System.out.println(grades.get(counter));         
      }  
    return arrlist;
    
    
    
    //end
    
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
