class Solution {
    public int maximumProduct(int[] nums) {
        int max1=Integer.MIN_VALUE; //max
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;

        int min1= Integer.MAX_VALUE; //min
        int min2= Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            //max find
            if(nums[i]>max1) //biggest
            {
                max3=max2;
                max2=max1;
                max1=nums[i];
            }
            else if(nums[i]>max2) //2nd largest
            {
                max3=max2;
                max2= nums[i];
            }
            else if(nums[i]>max3) //3rd largest
            {
                max3=  nums[i];
            }
            
            // 2 separate for minimum find
            if(nums[i]<min1) //minimun
            {
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<min2) //2nd minimum
            {
                min2= nums[i];
            }
        }

        int product1= max1*max2*max3; 
        int product2= min1*min2*max1; //2 -ve product results in +ve
        int result= Math.max(product1, product2);
        return result;
    }
}
