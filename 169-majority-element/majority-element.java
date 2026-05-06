class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int k = nums.length;
        int freq = 0;
        int ans = nums[0];
        for(int i=1;i<k;i++){
            if(freq==0){
                ans=nums[i];
            }
            if(ans==nums[i]){
                freq++;
            }else{
                freq--;
            }
            
        }
        return ans;
        
    }
}