package com.hjh.cn;

public class Solution {
	public int reverse(int x) {
		int temp;
		long num = 0;
		while(x != 0){
			temp = x % 10;
			x = x / 10 ;
			num = num * 10 +temp;
			System.out.println(num);
		}
		if(num >= Integer.MAX_VALUE || num <= Integer.MIN_VALUE){
			return 0;
		}
	    return (int) num;  
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverse(1534236469));
	}
	
	
}
