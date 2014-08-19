/**
 * 
 */
package com.ctrip.algorthims.common.exception;

/**
 * @author kwh
 *
 */
public class SortTypeNotSupportedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public SortTypeNotSupportedException(){
		super("This Sort Type is not supported!");
	}
	public SortTypeNotSupportedException(String originSortType){
		super("This Sort Type:"+originSortType+" is not supported!");
	}
}
