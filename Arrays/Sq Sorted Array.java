class Solution {
    public int[] sortedSquares(int[] nums) {
        // 2P ~ PWP
        ArrayList<Integer> pos= new ArrayList<>(); // >0
        ArrayList<Integer> neg= new ArrayList<>(); // <0

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>= 0)
            {
                pos.add(nums[i]);
            }
            else
            {
                neg.add(nums[i]);
            }
        }

        //case 1 - no neg
        if(neg.size()==0)
        {
            pos= helperPos(pos);
            return pos.stream().mapToInt(Integer::intValue).toArray(); //array to arraylist
        }

        //case 2- no pos
        else if(pos.size()==0) 
        {
            neg= helperNeg(neg);
            return neg.stream().mapToInt(Integer::intValue).toArray();
        }

        //case 3- mix
        int i=0,j=0; 

        int arr[]= new int[nums.length];
        int x=0;
        pos= helperPos(pos);
        neg= helperNeg(neg);

        while(i<pos.size() && j<neg.size())
        {
            if(pos.get(i)<neg.get(j)) // 2<3
            {
                arr[x]= pos.get(i); // 0--> 2
                x++;
                i++; //pos badhao
            }
            else // 3<2
            {
                arr[x]= neg.get(j); 
                x++;
                j++; //neg badhao
            }
        }// koi khtm hua

        while(i<pos.size()) // pos khali kro
        {
            arr[x] = pos.get(i);
            x++;
            i++;
        }

        while(j<neg.size()) //neg khali kro
        {
            arr[x] = neg.get(j);
            x++;
            j++;
        }

        return arr;
    }

    public static ArrayList<Integer> helperPos(ArrayList<Integer> pos)
    {
        for(int i=0;i<pos.size();i++)
        {
            pos.set(i, pos.get(i)*pos.get(i));
        }
        return pos;
    }

    public static ArrayList<Integer> helperNeg(ArrayList<Integer> neg)
    {
        for(int i=0;i<neg.size();i++)
        {
            neg.set(i, neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg); // -3 sq is > 2 sq
        return neg;
    }
}
