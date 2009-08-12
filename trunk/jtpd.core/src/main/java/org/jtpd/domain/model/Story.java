/**
 * 
 */
package org.jtpd.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author tdiler
 * 
 */
@Entity
@Table(name = "STORY")
public class Story extends GenericModel<Integer> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 3014010314406939738L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "AUTHOR")
	private User author;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "BODY")
	private String body;
	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private StoryType type;
	@Column(name = "CREATEDTIME")
	private Date createdTime;
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private StoryStatus status;
	@Column(name = "LOOKEDBY")
	private Integer lookedBy;
	@Column(name = "LOOKEDTIME")
	private Date lookedTime;

	public Story(User author) {
		super();
		this.author = author;
	}
	
	@Override
	public Integer getPK() {
		return this.id;
	}

	@Override
	protected void setPK(Integer id) {
		this.id = id;
	}

	public Integer getLookedBy() {
		return lookedBy;
	}

	public void setLookedBy(Integer lookedBy) {
		this.lookedBy = lookedBy;
	}


	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public StoryType getType() {
		return type;
	}

	public void setType(StoryType type) {
		this.type = type;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public StoryStatus getStatus() {
		return status;
	}

	public void setStatus(StoryStatus status) {
		this.status = status;
	}

	public Date getLookedTime() {
		return lookedTime;
	}

	public void setLookedTime(Date lookedTime) {
		this.lookedTime = lookedTime;
	}

}