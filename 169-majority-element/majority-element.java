class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int k = nums.length;
        int fre = 1;
        int n = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                fre++;
            }else{
                fre=1;
                n=nums[i];
            }
            if(fre>k/2){
                n=nums[i];
                break;
            }
        }
        return n;
        
    }
}