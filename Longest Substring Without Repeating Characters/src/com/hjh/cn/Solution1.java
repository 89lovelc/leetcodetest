package com.hjh.cn;

import java.util.HashMap;
import java.util.Map;

/**
 * Longest Substring Without Repeating Characters
 * 
 * 这个算法 主要是要掌握的是 要求的是 [i,j]这个区间一直没有重复的字符
 * 
 * 做法：就是先让i一直遍历 存入map 中去 存入的值是 <character,integer>
 * 		1.如果map中 没有重复的值 ，i 一直存入数据 并且更新max
 * 		2.有重复值的话  我们应该做的是 在第一个重复的地方的第二开始（前提是 这个位置要比之前的index 大）
 * @author huangjh
 */
public class Solution1 {
	public int lengthOfLongestSubstring(String s) {
	    Map<Character,Integer> map = new HashMap<>();
	    int i , j , max;
	    i = j = max = 0;
	    for( i = 0 ; i < s.length(); i++){
	    	if(map.containsKey(s.charAt(i))){
	    		j = j > map.get(s.charAt(i))?j: map.get(s.charAt(i));
	    	}
	    	max = max > (i - j +1) ? max :(i - j+1);
	    	map.put(s.charAt(i), i+1);
	    }
	    return max;
	  }
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Solution1 m = new Solution1();
		System.out.println(m.lengthOfLongestSubstring("mmmm"));
		long end = System.currentTimeMillis();
		System.out.println( end - start );
		
	}
	
}
