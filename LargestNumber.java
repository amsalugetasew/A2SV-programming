class Solution {
    public String largestNumber(int[] arr) {
    int i, key, j, n=arr.length;
        String k="";
        int [] b = new int[n];
        for(i =0; i<n;i++){
            b[i]=arr[i] % 10;
        }      
          int temp=0, tmp = 0;  
         for( i=0; i < n; i++){  
                 for( j=1; j < (n-i); j++){  
                    if(b[j-1] < b[j]){ 
                        
                        temp = b[j-1];
                        b[j-1] = b[j];  
                        b[j] = temp;
                        
                        tmp = arr[j-1];
                        arr[j-1] = arr[j];  
                        arr[j] = tmp; 
                         }     
                 }  
         } 
         System.out.println();
        for(i =0; i<n; i++){
            k += String.valueOf(arr[i]);  
        }
        return k;
    }
}
