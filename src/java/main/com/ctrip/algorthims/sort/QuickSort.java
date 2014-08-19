/**
 * 
 */
package com.ctrip.algorthims.sort;

/**
 * @author kwh
 *
 */
public class QuickSort implements Sorter {
	private static final QuickSort m_instance = new QuickSort();
	/* (non-Javadoc)
	 * @see com.ctrip.algorthims.sort.Sorter#sort(int[])
	 */
	@Override
	public int[] sort(int[] unSortedNumbers) {
		if(unSortedNumbers == null){
			return null;
		}
		int[] resultArray = new int[unSortedNumbers.length];
		return resultArray;
	}
	private QuickSort(){}
	public static QuickSort getInstance(){
		return m_instance;
	}
}
