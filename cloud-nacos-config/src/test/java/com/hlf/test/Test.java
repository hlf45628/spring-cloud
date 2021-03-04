package com.hlf.test;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static int[] twoSum(int[] nums, int target) {
        int length=nums.length;
        for(int i=0;i<length;i++){
            for(int j=1;j<length;j++){
                if(i<j&&nums[i]+nums[j]==target){
                    System.out.println("i=="+i+"j="+j);
                    return new int[]{i,j};
                }
            }
        }
        return  null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args){
        int[] nums = {3,2,4};
        int target = 6;
       int[] f= twoSum2(nums,target);
       System.out.println("i="+f[0]+"j="+f[1]);
    }
}
