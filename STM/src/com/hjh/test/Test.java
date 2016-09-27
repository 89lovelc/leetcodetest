package com.hjh.test;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class Test {
	/**
	 * 算出平均等待时间
	 * @param waitTime
	 * @param durations
	 * @return
	 */
	public static  float mathVarg(int []waitTime,int []durations){
		//给定的范围 start 和 end
		int start,end;
		start = waitTime[0];
		end = durations[0];
		//计算平均等待时间的综合
		int sum = 0;
		//已经计算了几个
		int total =0 ;
		//等待队列
		LinkedList<Myobject> list = new LinkedList();
		do{
			//筛选 在范围内的
			for(int i = total  + list.size(); i < waitTime.length ; i++){
				if(waitTime[i] > start && waitTime[i] <= end){
					list.add(new Myobject(waitTime[i], durations[i]));
				}
			}
			//通过api 进行排序（因为已经是在时间的顺序下面排序的，所以就在这个基础上排长短即可）
			Collections.sort(list, new Comparator<Myobject>() {
				@Override
				public int compare(Myobject o1, Myobject o2) {
					return o1.during.compareTo(o2.during);
				}
			});
			//得到第一个符合的对象 并且计算下一个范围是多少
			Myobject m1 = list.get(0);
			sum += end - m1.begin;
			start = end;
			end = start + m1.during;
			list.remove(0);
			total ++;
		}while( total != waitTime.length - 1);
		return  ((float)sum / waitTime.length);
	}
	
	
	public static void main(String[] args) {
//		int [] waitTime = new int []{0,2,4,5};
//		int [] durations = new int []{7,4,1,4};
		int [] waitTime = new int []{0,1,3,9};
		int [] durations = new int []{2,1,7,5};
		System.out.println(mathVarg(waitTime, durations));;
	}
}

class Myobject{
	int begin;
	Integer during;
	public Myobject(int begin,int during){
		this.begin = begin;
		this.during = during;
	}
}