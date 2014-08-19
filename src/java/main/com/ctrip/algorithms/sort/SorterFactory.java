/**
 * 
 */
package com.ctrip.algorithms.sort;

import com.ctrip.algorithms.common.exception.SortTypeNotSupportedException;

/**
 * @author kwh
 *
 */
public class SorterFactory {
	private static SorterFactory vInstance;
	private SorterFactory(){
	}
	public static SorterFactory getInstance(){
		if(vInstance == null){
			synchronized(SorterFactory.class){
				if(vInstance == null){
					vInstance = new SorterFactory();
				}
			}
		}
		return vInstance;
	}
	public Sorter getSorter(String sortType) throws SortTypeNotSupportedException{
		SortTypeEnum sortEnum = SortTypeEnum.getEnum(sortType);
		if(sortEnum.equals(SortTypeEnum.InsertionSort)){
			return InsertionSort.getInstance();
		}
		if(sortEnum.equals(SortTypeEnum.MergeSort)){
			return MergeSort.getInstance();
		}
		if(sortEnum.equals(SortTypeEnum.QuickSort)){
			return QuickSort.getInstance();
		}
		throw new SortTypeNotSupportedException(sortType);
	}
}
