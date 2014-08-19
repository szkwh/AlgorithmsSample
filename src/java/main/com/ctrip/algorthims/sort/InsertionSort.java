/**
 * 
 */
package com.ctrip.algorthims.sort;

import com.ctrip.algorthims.sort.Sorter;

/**
 * @author kwh
 *
 */
public class InsertionSort implements Sorter {
	private static final InsertionSort m_Instance = new InsertionSort();
	/* (non-Javadoc)
	 * @see com.ctrip.algorthims.sort.Sorter#sort(int[])
	 */
	@Override
	public int[] sort(int[] unSortedNumbers) {
		if(unSortedNumbers==null){
			return null;
		}
		if(unSortedNumbers.length==1){
			return unSortedNumbers;
		}
		int[] resultArray = unSortedNumbers.clone();
		for(int idx=1;idx<resultArray.length;idx++){
			int key = resultArray[idx];
			int compareIdx = idx-1;
			for(;compareIdx>=0&&resultArray[compareIdx]>key;compareIdx--){
				resultArray[compareIdx+1]=resultArray[compareIdx];
			}
			resultArray[compareIdx+1] = key;
		}
		return resultArray;
	}
	private InsertionSort(){
		
	}
	public static InsertionSort getInstance(){
		return m_Instance;
	}
}
