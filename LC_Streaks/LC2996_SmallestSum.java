import java.util.*;
class LC2996_SmallestSum {
    public int missingInteger(int[] nums) {
        int sum=nums[0];
        HashSet<Integer> set= new HashSet<>();
        set.add(nums[0]);
        int ct=0;
        for(int i=1;i<nums.length;i++)
        {
            set.add(nums[i]);
            if((nums[i] == nums[i-1]+1) && ct==0)//sequence
            {
                sum+= nums[i];
            }
            else
            {// conti sum nko
                ct++;
                continue;
            }
        }

        while(set.contains(sum))
        {
            sum++;
        }
        return sum;
    }
}