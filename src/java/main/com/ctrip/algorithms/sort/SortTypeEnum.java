/**
 * 
 */
package com.ctrip.algorithms.sort;

/**
 * @author kwh
 *
 */
public enum SortTypeEnum {
	InsertionSort,QuickSort,MergeSort,HeapSort,BubbleSort,Unknown;
	
	public static SortTypeEnum getEnum(String sortName){
		for(SortTypeEnum eachEnum:SortTypeEnum.values()){
			if(sortName.equalsIgnoreCase(eachEnum.name())){
				return eachEnum;
			}
		}
		return SortTypeEnum.Unknown;
	}
}
