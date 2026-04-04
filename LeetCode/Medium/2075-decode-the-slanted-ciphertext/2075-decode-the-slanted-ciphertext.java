class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int l = encodedText.length();
        int columns =  l/rows;
        int k = 0 ;
        String o= " ";
        char nums[][]= new char[rows][columns];
        for(int i = 0;nums.length>i;i++){
            for(int j = 0 ;j<nums[0].length;j++){
                nums[i][j]=encodedText.charAt(k);
                k++;

            }
        }
        for(int col= 0 ;columns>col;col++){
           int i = 0;
           int j = col;
            while(i<rows && j<columns){
                o+=nums[i][j];
                i++;
            j++;


            }
            o = o.trim();

        }
        return o ;
        
    }
}