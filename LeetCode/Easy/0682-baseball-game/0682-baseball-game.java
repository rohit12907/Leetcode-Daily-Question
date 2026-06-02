class Solution {
    public int calPoints(String[] arr) {
        Stack <Integer > st = new Stack<>();
        int sum = 0 ;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals("C") ){
                st.pop();
            }
            else if(arr[i].equals("+")){
              int  k= st.pop();
               int p = st.peek();
               
                int r = k + p ;
                st.push(k);
                 st.push(r);
                


            }
             else if(arr[i].equals("D")){
                int l = st.peek();
                st.push(l*2);

             }

            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
     
        List<Integer> intList = new ArrayList<>();
        while(st.size() > 0){
            int j = st.pop();
            intList.add(j);
        }
for(int num : intList){
    sum = sum + num ;
}



return sum ; 
    }
}