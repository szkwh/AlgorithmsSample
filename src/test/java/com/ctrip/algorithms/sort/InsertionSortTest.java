/**
 * 
 */
package com.ctrip.algorithms.sort;

import static org.junit.Assert.*;

import java.util.Arrays;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.ctrip.algorithms.common.exception.SortTypeNotSupportedException;

/**
 * @author whkang
 *
 */
public class InsertionSortTest {
	private static final int[] testIntArray = {8,2,4,3,1,5,7,6,9,10};
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Test method for {@link com.ctrip.algorithms.sort.InsertionSort#sort(int[])}.
	 */
	@Test
	public void testSort()  throws SortTypeNotSupportedException{
		Sorter testSorter = SorterFactory.getInstance().getSorter(SortTypeEnum.InsertionSort.toString());
		int[] tempArray = testIntArray.clone();
		Arrays.sort(tempArray);
		int[] resultArray = testSorter.sort(testIntArray);
		assertTrue(Arrays.equals(tempArray, resultArray));
	}

}
