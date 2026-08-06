class Solution {
    public int maxProduct(int n) {

// T.C- O(log n) -->> 
        int max1= 0; 
        int max2= 0; 
        while(n>0)
        {
            int ld= n%10;
            if(ld>max1)
            {
                max2=max1;
                max1=ld;
            }
            else if(ld>max2)
            {
                max2=ld;
            }
            n=n/10;
        }
        int product=max1*max2;
        return product;
    }
}

// T.C- O(n^2) -->>
// String s = Integer.toString(n);
//         int[] digits = new int[s.length()];
//         for (int i = 0; i < s.length(); i++) 
//         {
//             digits[i] = s.charAt(i) - '0';  // char to int
//         }

//         int product=0;
//         if(digits.length==1) return n; //single digit no
//         for(int i=0;i<digits.length;i++)
//         {
//             for(int j=i+1; j<digits.length;j++)
//             {
//                 int pro= digits[i]*digits[j];
//                 product= Math.max(product,pro);
//             }
            
//         }
//         return product;
