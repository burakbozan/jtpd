package org.jtpd.domain.model;

import javax.persistence.Entity;
import javax.persistence.Table;

// TODO Bu entity kullan�l�yor mu?
@Entity 
@Table(name="jforum_users")
public class JForumUser extends GenericModel<Integer> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1454448827539122672L;

	private String username ;
	
	private String password ;
	
	
}
