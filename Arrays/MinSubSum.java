class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int sum=0;
        int res= Integer.MAX_VALUE;

        while(high<nums.length)
        { //Expand window
            sum=sum+nums[high];

            while(sum>=target)
            { //Shrink window for shortest len
                int len= high-low+1;
                res= Math.min(len,res); //shortest len stored
                sum=sum-nums[low]; // shrinking window- removed 1st element
                low++;
            }
            high++;
        }
        if(res==Integer.MAX_VALUE) //target ya usse bda mila hi nhi
        {
            return 0;
        }
        else
        {
            return res;
        }
    }
}
Link to Code- https://leetcode.com/problems/minimum-size-subarray-sum/solutions/8442550/easiest-sliding-window-soln-with-explana-twu4
