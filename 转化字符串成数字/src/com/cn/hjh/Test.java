package com.cn.hjh;

/**
 * 实现atoi这个函数，将一个字符串转换为整数。如果没有合法的整数，返回0。
 * 如果整数超出了32位整数的范围，返回INT_MAX(2147483647)如果是正整数，
 * 或者INT_MIN(-2147483648)如果是负整数。
 *
 */
public class Test {
		
	public static void main(String[] args) {
		int a = 0 ;
		a = -2147483647+-214748364;
		System.out.println(Character.MAX_RADIX);
	}
	
	
	
	
	
	 public static int parseInt(String s, int radix)
     
     {
        
         if (s == null) {
             throw new NumberFormatException("null");
         }
 
         if (radix < Character.MIN_RADIX) {
             throw new NumberFormatException("radix " + radix +
                                             " less than Character.MIN_RADIX");
         }
 
         if (radix > Character.MAX_RADIX) {
             throw new NumberFormatException("radix " + radix +
                                             " greater than Character.MAX_RADIX");
         }
 
         int result = 0;
         boolean negative = false;
         int i = 0, len = s.length();
         int limit = -Integer.MAX_VALUE;
         int multmin;
         int digit;
 
         if (len > 0) {
             char firstChar = s.charAt(0);
             if (firstChar < '0') { // Possible leading "+" or "-"
                 if (firstChar == '-') {
                     negative = true;
                     limit = Integer.MIN_VALUE;
                 } else if (firstChar != '+')
                     return  0;
 
                 if (len == 1) // Cannot have lone "+" or "-"
                	 return  0;
                 i++;
             }
             multmin = limit / radix;
             while (i < len) {
                 // Accumulating negatively avoids surprises near MAX_VALUE
                 digit = Character.digit(s.charAt(i++),radix);
                 if (digit < 0) {
                	 return  0;
                 }
                 if (result < multmin) {
                	 return  0;
                 }
                 result *= radix;
                 if (result < limit + digit) {
                	 return  0;
                 }
                 result -= digit;
             }
         } else {
        	 return  0;
         }
         return negative ? result : -result;
     }
	
	 
	 
	 
	 public static int atoi(String str){
			char[] ss = str.toCharArray();
			int num = 0 ;
			if(ss[0] == '-'){
				int j = 0;
				if(ss.length > 11){
				    return Integer.MIN_VALUE;
				}
				for(int i = ss.length -1 ; i > 0 ; i -- ){
					int m = retNum(ss[i]);
					if(m == -1){
						return 0;
					}
					num +=  m * ((int)Math.pow(10, j))  ;
					j++;
				}
				if(num < 0){
					return 0;
				}
				return -num;
			}else{
			    if(ss.length > 10 ){
			        return Integer.MAX_VALUE;
			    }
				int j = 0;
				for(int i = ss.length -1 ; i > -1 ; i -- ){
					int m = retNum(ss[i]);
					if(m == -1){
						return 0;
					}
					num +=  m * ((int)Math.pow(10, j))  ;
					j++;
				}
				if(num < 0){
					return 0;
				}
				return  num;
			}
			
		}
	
	 public static boolean isNum(char a){
			if( a >= '0' && a <='9') return true;
			else return false;
		}
		
	 public static int retNum(char a){
			switch(a){
				case '0': 
					return 0;
				case '1': 
					return 1;
				case '2': 
					return 2;
				case '3': 
					return 3;
				case '4': 
					return 4;
				case '5': 
					return 5;
				case '6': 
					return 6;
				case '7': 
					return 7;
				case '8': 
					return 8;
				case '9': 
					return 9;
				default : 
					return -1;
			}
		}
		
}
