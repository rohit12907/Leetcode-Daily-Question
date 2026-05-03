class Solution{
    String temp ;
    public boolean rotateString(String s, String goal) {
            int n = s.length();
            String s2 = new String(s);
            
            for(int i = 0 ; n>i;i++){
            temp =  s2.substring(i) + s2.substring(0, i);
            if(temp.equals(goal)){
                return true;
            }
            }
            return false;
    }}