/**
 * 
 */
package com.ctrip.algorithms.sort;

/**
 * @author whkang
 *
 */
public class HeapSort  implements Sorter{
	private static final HeapSort m_Instance = new HeapSort();
	public static HeapSort getInstance(){
		return m_Instance;
	}
	private HeapSort(){}
	@Override
	public int[] sort(int[] unSortedNumbers) {
		Heap unSortedHeap = new Heap(unSortedNumbers, unSortedNumbers.length);
		unSortedHeap.buildMaxHeap();
		for(int idx = unSortedNumbers.length-1;idx>0;idx--){
			int tmpItm = unSortedNumbers[0];
			unSortedNumbers[0] = unSortedNumbers[idx];
			unSortedNumbers[idx] = tmpItm;
			unSortedHeap.setHeapSize(unSortedHeap.getHeapSize()-1);
			unSortedHeap.maxHeapify(0);
		}
		return unSortedNumbers;
	}
	
	class Heap{
		private int[] vContentArray;
		private int vHeapSize;
		public Heap(int[] initArray,int heapSize){
			this.vContentArray = initArray;
			this.vHeapSize = heapSize;
		}
		public int parent(int i){
			return (int)Math.floor((i-1)/2);
		}
		public int left(int i){
			return 2*i+1;
		} 
		public int right(int i){
			return 2*i+2;
		}
		public int[] getHeapArray(){
			return this.vContentArray;
		}
		public int getHeapSize(){
			return vHeapSize;
		}
		public void setHeapSize(int heapSize){
			this.vHeapSize = heapSize;
		}
		public void maxHeapify(int idx){
			int leftIdx = left(idx);
			int rightIdx = right(idx);
			int largestIdx = idx;
			if(leftIdx<=this.getHeapSize()-1&&vContentArray[leftIdx]>vContentArray[idx]){
				largestIdx = leftIdx;
			}
			if(rightIdx<=this.getHeapSize()-1&&vContentArray[rightIdx]>vContentArray[largestIdx]){
				largestIdx = rightIdx;
			}
			if(largestIdx!=idx){
				int tmpItm = vContentArray[largestIdx];
				vContentArray[largestIdx] = vContentArray[idx];
				vContentArray[idx] = tmpItm;
				maxHeapify(largestIdx);
			}
		}
		public void buildMaxHeap(){
			for(int idx = (int)Math.floor((this.getHeapSize()-1)/2);idx>=0;idx--){
				maxHeapify(idx);
			}
		}
	}
}
