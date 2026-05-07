import java.util.*;


class Solution {
    public void revers(int[] nums,int i, int h){
        while(h>i){
            int temp = nums[i];
            nums[i]=nums[h];
            nums[h]=temp;
            i++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {

        int l = nums.length;
        k=k%l;
        revers(nums,0,l-1);
        revers(nums,0,k-1);
        revers(nums,k,l-1);
        System.out.print(Arrays.toString(nums));
    }
}