import javax.lang.model.util.ElementScanner14;

//There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).


class Solution {
    public static boolean search(int[] nums, int target) {
        int end=nums.length-1;
        int start=0;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target == nums[mid])
                return true;
            
            if(nums[start]<nums[mid])
            {
                if(target>=nums[start] && target<nums[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
            else if(nums[start]>nums[mid])
            {
                if(target>nums[mid] && target<=nums[end])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
            else{
                start++;

            }
        }
        return false;
    }

    public static void main(String args[])
    {
        int[]  nums = {2,5,6,0,0,1,2};
        int target = 3;
        boolean x = search(nums,target);
        System.out.println(x);
    }
}
