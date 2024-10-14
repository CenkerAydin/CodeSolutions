package java.leetcode.easy;

//Problem Linki -> https://leetcode.com/problems/two-sum/description/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for(int i=0; i< nums.length-1;i++){
            for(int j=i+1 ;j <nums.length; j++){
                if(nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] result = ts.twoSum(new int[]{2, 7, 11, 15}, 17);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
