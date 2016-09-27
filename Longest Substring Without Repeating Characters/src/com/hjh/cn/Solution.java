package com.hjh.cn;

import java.util.HashSet;

/**
 * Longest Substring Without Repeating Characters
 * 
 * 思想就是将所有的子序列全部的罗列出来
 * 然后在这个 子序列中判断是否有重复的char  
 * 在这个里面使用了一个特性 就是set
 * 
 * @author huangjh
 *
 */
public class Solution {
	public int lengthOfLongestSubstring(String s) {
	    int length = s.length();
	    if(length == 1){
	    	return 	1;
	    }
	    int max = 0;
	    for(int i = 0 ; i < length-1 ;i++){
	    	for(int j = i+1 ; j <=length; j++){
	    		if(!isRepeat(s.substring(i,j))){
	    			max  = max > (j - i) ? max :(j-i);
	    		}
	    	}
	    }
		return max;
	  }
	private boolean isRepeat(String substring) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < substring.length(); i++) {
			char c = substring.charAt(i);
			if(set.contains(c)){
				return true;
			}
			set.add(c);
		}
		return false;
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Solution m = new Solution();
		System.out.println(m.lengthOfLongestSubstring("imvetmeledannnivadbxvtonrardstlbhihawmnbrnofaycddecyzsoquhvnaiojrvlnjyqblginhkskqwlppbhjicwklmteket"));
		long end = System.currentTimeMillis();
		System.out.println( end - start );
		
	}
	
}
