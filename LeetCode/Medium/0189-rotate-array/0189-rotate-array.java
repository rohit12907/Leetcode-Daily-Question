class Solution {

    public void rotate(int[] nums, int k) {
        int s = 0 ;
        int n = nums.length;
        int e = nums.length - 1 ;
        k = k % n;
        reverse(nums,s , e);
        reverse(nums,s , k-1);
        reverse(nums,k , e);
    }
    public static void reverse(int [] arr, int left, int right){
         while(right>left){
            int t = arr[left];
            arr[left]= arr[right];
            arr[right]=t;
            right--;
            left++;
            
            }

        }
    }
