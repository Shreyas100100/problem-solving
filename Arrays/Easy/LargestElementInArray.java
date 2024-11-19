package Arrays.Easy;

public class LargestElementInArray {
    public static int LargestElement(int []nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i:nums)
        {
            if(i>max)max=i;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,0};
        System.out.println(LargestElement(nums));
    }
}
