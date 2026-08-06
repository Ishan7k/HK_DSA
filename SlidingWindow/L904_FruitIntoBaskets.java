import java.util.*;
class L904_FruitIntoBaskets {
    public int totalFruit(int[] fruits) {
        int low=0;
        int n= fruits.length;
        int maxLen=0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int high=0; high<n; high++)
        {
            map.put(fruits[high], map.getOrDefault(fruits[high],0)+1);

            while(map.size()>2) // 2 se zyada type ke fruits nhi chaiye
            {
                int leave= fruits[low];
                //shrink
                map.put(leave, map.get(leave)-1);//reduced freq of fruit
                if(map.get(leave)==0) // GHEE KHTM FRUIT KA
                {
                    map.remove(leave); //RETIRED!!
                }
                low++; // window shrink n ahead
            }
            //size is less or equal to 2
            int len= high-low+1; //kinte fruits hai
            maxLen= Math.max(maxLen,len); //max quantity possible 
        }
        return maxLen;
    }
}