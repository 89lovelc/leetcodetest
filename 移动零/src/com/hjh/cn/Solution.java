package com.hjh.cn;

import java.util.Arrays;
import java.util.HashSet;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

/**
 	给一个数组 nums 写一个函数将 0 移动到数组的最后面，非零元素保持原数组的顺序
	 注意事项
	1.必须在原数组上操作
	2.最小化操作数
	样例
	给出 nums = [0, 1, 0, 3, 12], 调用函数之后, nums = [1, 3, 12, 0, 0].
 */
public class Solution {
    /**
     * @param nums an integer array
     * @return nothing, do this in-place
     */
    public static void moveZeroes(int[] nums) {
    	HashSet<Integer> set = new HashSet<Integer>(); 
    	//遍历一遍 
    	for(int i = 0 ; i < nums.length;i++){
    		if(nums[i] == 0){
    			set.add(i);
    		}
    	}
    	int j = 0;
    	for(int i = 0 ; i < nums.length;i++){
    		if(set.contains(i)){
    			continue;
    		}
    		nums[j++] = nums[i];
    	}
    	
    	for(;j<nums.length;j++){
    		nums[j]=0;
    	}
    	
    }
    
    public static void main(String[] args) {
    	int [] nums = {1,0,3,0,4};
    	moveZeroes(nums);
    	System.out.println(Arrays.toString(nums));
	}
    
}