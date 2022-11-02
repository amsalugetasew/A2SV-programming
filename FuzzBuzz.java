import java.util.*;  // Import the Scanner class
import java.util.ArrayList;
class Solution {
    public List<String> fizzBuzz(int n) {
        Scanner sc= new Scanner(System.in); 
        if (sc.hasNextInt()) {
          n= sc.nextInt();
          }
       String newarr[] = new String[n];
        
        for(int i =0; i<n; i++){
            
            if((i+1)%3 == 0 && (i+1)%5 == 0)
              {             
                newarr[i] = "FizzBuzz";
          }  
          else if((i+1)%3 == 0 && (i+1)%5 != 0){
              newarr[i] = "Fizz";
          } 
            else if((i+1)%3 != 0 && (i+1)%5 == 0){
                newarr[i] = "Buzz";
          } 
            else{
                String s=Integer.toString(i+1);              
                newarr[i] =  s ;
   
       
            }
        }
          List al = Arrays.asList(newarr);
        System.out.println(al);
        return al;
    }
}
