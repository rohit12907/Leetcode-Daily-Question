import java.util.Scanner;
class Solution {
    public int lengthOfLastWord(String s) {
         int len = s.trim().substring(s.trim().lastIndexOf(" ") + 1).length();
         return len ;
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       String c = sc.nextLine();
       Solution S = new Solution();
       System.out.println(S.lengthOfLastWord(c));
       
    }
}