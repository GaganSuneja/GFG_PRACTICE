package Arrays;

import java.util.ArrayList;
import java.util.List;

class GFGPractice{
    
    public static void main(String args[]) {
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(1);
        // list.add(1);
        // list.add(1);
        // list.add(1);
        // list.add(0);
        // System.out.println(longestSumof1s(list));
        // Solution s  = new Solution();
        int input[] = {12,345,2,6,7896};
        findNumbers(input);
        
    }   

    public static int findNumbers(int[] nums) {
        int noOfEventDigits = 0;
        String noInString = "";
        for(int i =0;i<nums.length;i++) {
            noInString = String.valueOf(nums[i]);
            int k = (noInString.length() % 2 == 0)? noOfEventDigits++:0;
        }
        return noOfEventDigits;
        
    }

    public static int longestSumof1s(List<Integer> list) {
        int maxSum = 0;
        int auxSum = 0;
        for(int i=0;i<list.size();i++) {
            auxSum = list.get(i).intValue() == 1? auxSum+1 :  0;
            maxSum = auxSum > maxSum ? auxSum:maxSum;
        }
        return maxSum;
    }

    class Solution {
       
    }
}