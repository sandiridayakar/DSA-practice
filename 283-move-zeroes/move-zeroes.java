class Solution {
    //code in dsa
    public void moveZeroes(int[] nums) {
        int insertionOrder =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[insertionOrder]=nums[i];
                insertionOrder++;
            }
        } 
        while (insertionOrder<nums.length){
            nums[insertionOrder]=0;
            insertionOrder++;
        }
    }
}