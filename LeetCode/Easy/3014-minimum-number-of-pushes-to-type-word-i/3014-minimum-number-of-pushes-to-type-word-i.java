// class Solution {
//     public int minimumPushes(String word) {
//         int l = word.length();
//             // int single = 8 ;
//             // int doub = (l-8)*2;
//             // int triple = (l-16)*3;
//             // int fourple = (l-24)*4;
//         if(l<=8) return l ;
//         else if(l<=16) {
//             // int single = 8 ;
//             // int doub = (l-8)*2;
//             // return doub + single ;
//             return 8
//         }
//         else if(l<=24){
//             // int single = 8 ;
//             // int doub = (l-8)*2;
//             // int triple = (l-16)*3;
//             return doub + single + triple ;

//         }
//         else {
//             //  int single = 8 ;
//             // int doub = (l-8)*2;
//             // int triple = (l-16)*3;
//             // int fourple = (l-24)*4;
//               return doub + single + triple + fourple;
//         }
        
//     }
// }






class Solution {
    public int minimumPushes(String word) {

        int l = word.length();

        if (l <= 8) {
            return l;
        } 
        else if (l <= 16) {
            return 8 + (l - 8) * 2;
        } 
        else if (l <= 24) {
            return 8 + 16 + (l - 16) * 3;
        } 
        else {
            return 8 + 16 + 24 + (l - 24) * 4;
        }
    }
}