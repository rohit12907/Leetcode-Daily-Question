class Solution {
    boolean ispowertwo(int n){
        return((n&(n-1))==0);
    }
    boolean isroot(int n){
        int root = (int)Math.sqrt(n);
        return (root*root==n);
    }
    public boolean isPowerOfFour(int n) {
        return ispowertwo(n) && isroot(n);
        
    }
}