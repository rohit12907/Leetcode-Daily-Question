class Solution {
    public boolean checkString(String s) {
        int l = s.length();
        // boolean f = true ; 
        int i ;
        int k ;
        for( i= 0 ; i < l ; i++){
            if(s.charAt(i)=='b'){
                break;
            }
        }
        for( k = i ; k < l ;k++){
            if(s.charAt(k)=='a'){
                return false ;
            }
        }
     return true;
        
    }
}