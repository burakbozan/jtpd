/**
 * 
 */
package org.jtpd.exception;

/**
 * @author altuga
 *
 */
// TODO �ok basit bir exception ne ama�l� yarat�ld�?
public class CantEditException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 615204352823481806L;

	public CantEditException(String message) {
		super(message) ;
	}
	
	public CantEditException() {
		super() ;
	}
}
