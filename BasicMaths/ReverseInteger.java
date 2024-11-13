package BasicMaths;

public class ReverseInteger
{
    public static void main(String args[])
    {
        int  n  = -123;
        Solution sol = new Solution();
        System.out.println(sol.reverse(n));
    }
}

class Solution
{
    public int reverse(int n)
    {
        int res=0;
        while(n!=0)
        {
            int mod = n%10;
            res=res*10+mod;
            n/=10;
        }
        return res;
    }
}


