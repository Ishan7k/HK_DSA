/*
 * Problem: Find the second-largest element in an array.
 * Approach: 
 *   - Track largest and second-largest in one pass.
 *   - Handle duplicates and edge cases (array length < 2, all elements equal).
 * Complexity: 
 *   - Time: O(n)
 *   - Space: O(1)
 * Striver
 */

class Solution {
    public int secondLargestElement(int[] nums) {
        int largest= Integer.MIN_VALUE;
        int sec_largest= Integer.MIN_VALUE;

        if(nums.length<2) return -1;

        

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>largest) //sbse bda mila
            {
                sec_largest= largest; //ab pehle wala largest 2nd largest bn jaega
                largest= nums[i]; //new wala largest
            }

            else if(nums[i]>sec_largest && nums[i]!= largest) //2nd largest se bda pr largest se chota
            {
                sec_largest= nums[i];
            }
        }
        return (sec_largest == Integer.MIN_VALUE) ? -1 : sec_largest; //agr smallest reh gya to -1 return kro naaaaaaa!!!!!!!!!!!! AI
    }
}
