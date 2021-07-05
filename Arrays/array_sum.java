package Arrays;

import java.util.ArrayList;
import java.util.List;

class GFGPractice{
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(0);
        System.out.println(longestSumof1s(list));
        
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
}