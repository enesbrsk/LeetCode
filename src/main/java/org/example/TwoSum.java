package org.example;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result = twoSum(nums,target);

        System.out.printf(Arrays.toString(result));
    }

    private static final int[] twoSum(int[] nums, int target){

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i<nums.length ;i++){

            for (int j= i+1;j< nums.length;j++){

                if ( (nums[i] + nums[j]) == target){
                    resultList.add(i);
                    resultList.add(j);
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}



