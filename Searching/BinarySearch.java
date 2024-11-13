package Searching;

public class BinarySearch {
    public static int BinarySearch(int []nums, int target)
    {
        int s=0, e=nums.length-1;
        while(s<=e)
        {
            int mid = s+(e-s)/2;
            if(nums[mid]<target)s=mid+1;
            else if(nums[mid]==target)return mid;
            else e=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int target = 5;
        System.out.println(BinarySearch(nums,target));

    }
}

