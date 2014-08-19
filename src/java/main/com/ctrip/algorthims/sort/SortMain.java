package com.ctrip.algorthims.sort;

import java.util.Arrays;

import com.ctrip.algorthims.common.exception.SortTypeNotSupportedException;

public class SortMain {
	public static void main(String[] args){
		if(args.length<=1){
			System.out.println("Syntax: java SortAlgorithms sortType <Numbers>");
			System.out.println("Sort Type Supported:InsertionSort, QuickSort, MergeSort, HeapSort, BubbleSort");
			System.out.println("Numbers are those numbers to be sorted delimitered by comma. ");
			return;
		}
		String inputStr = args[1];
		String[] strNumbers = inputStr.split(",");
		int[] unSortedNumbers = new int[strNumbers.length];
		for(int idx=0;idx<strNumbers.length;idx++){
			unSortedNumbers[idx] = Integer.parseInt(strNumbers[idx]);
		}
		try{
			Sorter mySort = SorterFactory.getInstance().getSorter(args[0]);
			int[] sortedNumbers =  mySort.sort(unSortedNumbers);
			System.out.println(Arrays.toString(sortedNumbers));
		}catch(SortTypeNotSupportedException exp){
			exp.printStackTrace();
		}
	}
}
