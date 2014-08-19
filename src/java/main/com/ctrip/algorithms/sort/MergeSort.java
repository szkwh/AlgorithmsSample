package com.ctrip.algorithms.sort;

public class MergeSort implements Sorter {
	private static final MergeSort m_instance = new MergeSort();
	
	@Override
	public int[] sort(int[] unSortedNumbers) {
		if(unSortedNumbers == null){
			return null;
		}
		int[] result = recursiveSort(unSortedNumbers,0,unSortedNumbers.length-1);
		return result;
	}
	private int[] recursiveSort(int[] sortNumbers, int start, int end){
		if((end-start)==0){
			return new int[]{sortNumbers[start]};
		}
		int[] sortedPartA = recursiveSort(sortNumbers, start, start+(end-start)/2);
		int[] sortedPartB = recursiveSort(sortNumbers, start+(end-start)/2+1,end);
		int[] sortedResult = mergeSortedArray(sortedPartA, sortedPartB);
		return sortedResult;
	}
	private int[] mergeSortedArray(int[] sortedArrayA, int[] sortedArrayB){
		int[] resultArray = new int[sortedArrayA.length+sortedArrayB.length];
		int idxA =0, idxB = 0, idx=0;
		for(;idxA<sortedArrayA.length&&idxB<sortedArrayB.length;){
			if(sortedArrayA[idxA]<=sortedArrayB[idxB]){
				resultArray[idx++] = sortedArrayA[idxA++];
			}else{
				resultArray[idx++] = sortedArrayB[idxB++];
			}
		}
		for(;idxA<sortedArrayA.length;idxA++){
			resultArray[idx++] = sortedArrayA[idxA];
		}
		for(;idxB<sortedArrayB.length;idxB++){
			resultArray[idx++] = sortedArrayB[idxB];
		}
		return resultArray;
	}
	private MergeSort(){
		
	}
	public static MergeSort getInstance(){
		return m_instance;
	}
}
