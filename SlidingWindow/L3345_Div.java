class L3345_Div {
    public int smallestNumber(int n, int t) {
        boolean cond= true;
        int res=0;
        int x=n;
        while(cond)
        {
            int pro=1;
            n=x;
            while(n>0)
            {
                int ld= n%10;
                pro= pro*ld;
                n=n/10;
            }

            if(pro%t==0)
            {
                cond=false;
                res=x;
                break;
            }
            else 
            {
                x++;
            }
        }
    return res;
    }
}