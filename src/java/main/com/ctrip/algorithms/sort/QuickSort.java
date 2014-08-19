/**
 * 
 */
package com.ctrip.algorithms.sort;

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
		quickSort(unSortedNumbers,0,unSortedNumbers.length-1);
		return unSortedNumbers;
	}
	private void quickSort(int[] unSortedNumbers, int startIdx, int endIdx){
		if(startIdx < endIdx){			
			int partPos = partition(unSortedNumbers, startIdx, endIdx);
			quickSort(unSortedNumbers, startIdx, partPos-1);
			quickSort(unSortedNumbers, partPos+1, endIdx);
		}
	}
	private int partition(int[] unSortedNumbers, int startIdx, int endIdx){
		int retPos = -1;
		int keyPos = startIdx+(int)Math.round(Math.random()*(endIdx-startIdx));
		int key = unSortedNumbers[keyPos];
		unSortedNumbers[keyPos] = unSortedNumbers[endIdx];
		unSortedNumbers[endIdx] = key;
		int pos = startIdx-1;
		for(int idx=startIdx;idx<=endIdx-1;idx++){
			if(unSortedNumbers[idx]<=key){
				pos++;
				int tmpNum = unSortedNumbers[idx];
				unSortedNumbers[idx] = unSortedNumbers[pos];
				unSortedNumbers[pos] = tmpNum;
			}
		}
		unSortedNumbers[endIdx] = unSortedNumbers[pos+1];
		unSortedNumbers[pos+1] = key;
		retPos = pos+1;
		return retPos;
	}
	private QuickSort(){}
	public static QuickSort getInstance(){
		return m_instance;
	}
}
