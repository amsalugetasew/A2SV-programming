class Solution {
    public void sortColors(int[] nums) {
        int i, n=nums.length,t;
        for(i=0; i<n;i++){ 
            for(int j=1; j < (n-i); j++){  
                if(nums[j-1] > nums[j]){  
                   t = nums[j-1];  
                    nums[j-1] = nums[j];  
                    nums[j] = t;  
                         }  
                          
                 }  
         }
        for(i =0; i<n;i++){
            System.out.print(nums[i]);
        }
    }
}
