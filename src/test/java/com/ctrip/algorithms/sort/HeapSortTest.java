/**
 * 
 */
package com.ctrip.algorithms.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.ctrip.algorithms.common.exception.SortTypeNotSupportedException;

/**
 * @author whkang
 *
 */
public class HeapSortTest {
	private static final int[] testIntArray = {8,2,4,3,1,5,7,6,9,10};
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws SortTypeNotSupportedException{
		Sorter testSorter = SorterFactory.getInstance().getSorter(SortTypeEnum.HeapSort.toString());
		int[] tempArray = testIntArray.clone();
		Arrays.sort(tempArray);
		int[] resultArray = testSorter.sort(testIntArray);
		assertTrue(Arrays.equals(tempArray, resultArray));
	}

}
