class Solution {
    public int majorityElement(int[] nums) {
        int k = (nums.length)/2;
        int n =-1;
        for(int i=0;i<nums.length;i++){
            int fre = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    fre++;
                }
                
            }
        if(fre>k){
            n= nums[i];
                    // break;
            }
        }
        return n;
        
    }
}