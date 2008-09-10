package org.peigen.ssh.basemanage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BaseDataList entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "baseDataList", catalog = "test", uniqueConstraints = {})
public class BaseDataList implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer TId;
	private String listName;

	// Constructors

	/** default constructor */
	public BaseDataList() {
	}

	/** full constructor */
	public BaseDataList(Integer id, Integer TId, String listName) {
		this.id = id;
		this.TId = TId;
		this.listName = listName;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "T_ID", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getTId() {
		return this.TId;
	}

	public void setTId(Integer TId) {
		this.TId = TId;
	}

	@Column(name = "ListName", unique = false, nullable = false, insertable = true, updatable = true, length = 40)
	public String getListName() {
		return this.listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

}