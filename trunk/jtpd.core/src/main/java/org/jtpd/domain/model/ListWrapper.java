package org.jtpd.domain.model;

import java.util.ArrayList;

// TODO Buras� kullan�l�yor mu? kulln�l�yorsa DTO olarak modellerden ayr�labilir.
public class ListWrapper extends ArrayList {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -663381733563649137L;

	/**
     * Returns a ListObject using get(index) from the Array.
     * @param index int index of the List object into the array
     * @return ListObject
     */
    public ListObject getItem(int index)
    {
        return (ListObject) super.get(index);
    }
	
	 
}
