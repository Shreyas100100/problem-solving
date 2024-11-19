package Arrays.Easy;

public class SecondLargestElementInArray {
    public static int SecondLargest(int []nums)
    {
        int mx=Integer.MIN_VALUE;
        int smx =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>mx)
            {
                if(mx!=smx)smx=mx;
                mx = Math.max(nums[i],mx);
            }
            else
            {
                if(mx!=nums[i])smx = Math.max(smx,nums[i]);
            }
        }
        return smx;
    }

    public static void main(String[] args) {
        int []nums = {2,5,1,3,0};
        System.out.println(SecondLargest(nums));
    }
}
