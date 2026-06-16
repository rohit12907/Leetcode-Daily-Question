class Solution {
    public String processStr(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<l;i++){
        
            if(s.charAt(i)=='*'){
                if(sb.length()>0 )
                sb.deleteCharAt(sb.length() - 1);
            }
            else if(s.charAt(i)=='#'){
                if(sb.length() >0 )
                sb.append(sb);
            }
            else if(s.charAt(i)=='%'){
                if(sb.length() >0 )
                sb.reverse();
            }
            else{
                sb.append(s.charAt(i));
            }
            }

                 String r= sb.toString();
         return r ;
        
    }
}