package Searching;


public class LinearSearch {
    public static int LinearSearch(int []nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] nums = {1,4,2,3,8,5,6,9};
        int target =9;
        System.out.println(LinearSearch(nums,target));
    }
}


