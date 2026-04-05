class Solution {
    public boolean judgeCircle(String moves) {
        int l = moves.length();
        int jump = 0;
        int R = 0;
        int L = 0 ;
        int D = 0 ;
        int U = 0 ;
        for(int i =0 ;l>i;i++){
            if(moves.charAt(i)==('U')){
                U++;
            }
            else if(moves.charAt(i)== ('D')){
                D--;
            }
              else if(moves.charAt(i)== ('R')){
                R++;
            }
              else {
                L--;
            }
        }
        if(R+L==0 && D + U ==0){
            return true;
        }
        else{
           return false;
        }
    }
}