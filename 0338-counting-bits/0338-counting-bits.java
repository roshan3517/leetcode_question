class Solution {
    public int[] countBits(int n) {
        int [] ans=new int[n+1];
        for(int i=0;i<=n;i++){
            ans[i]=countSetBits(i);
        }
        return ans;
    }
    public int countSetBits(int n){
        if(n==0){
            return 0;
        }
        return (n&1)+countSetBits(n>>1);
    }
}