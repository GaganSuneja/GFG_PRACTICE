package Arrays;
// GFG LINK
//  https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/
public class MaxSumOf1s {
    
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0;
        int auxSum = 0;
        for(int i =0;i<nums.length;i++) {
            if(nums[i] == 1) {
                auxSum++;
            }else {
                auxSum = 0;
            }
            if(auxSum > maxSum) {
                maxSum = auxSum;
            }
        }
        return maxSum;
    }
    String s = "abs";
    
}
}
