class Solution {
    public int[] findOriginalArray(int[] changed) {
        int i, n = changed.length, count=0;
        int [] original = new int [n/2];
        int [] O = {};
        
        if(n==2){
        int temp = 0;  
         for( i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(changed[j-1] > changed[j]){ 
                                 temp = changed[j-1];  
                                 changed[j-1] = changed[j];  
                                 changed[j] = temp;  
                         }  
                          
                 }  
         }  
        }
        for( i = 0; i < n/2; i++){
            original[i] = changed[i];
        }
        if(n>1){
        for( i = (n/2); i < n; i++){
            int x = original[((i)-n/2)];
            if(changed[i] == x*2){
                count++;
            }
        }
        }
        if(count == n/2){
            return original;
        }
        else{
            return O;
        }
        
    }
}
