public class Main {
  
   static class Solution {
       public int singleNumber(int[] nums) {
           int xorResult = 0;


           // XOR all elements: duplicates cancel out, single remains
           for (int num : nums) {
               xorResult ^= num; // XOR operation
           }
           return xorResult;
       }
   }


   public static void main(String[] args) {
     
       // all elements appear twice except 4
       int[] nums = {2, 3, 5, 4, 5, 3, 2};


       Solution sol = new Solution();
       int result = sol.singleNumber(nums);


       System.out.println("Single number is: " + result); // output: 4
   }
}
