package org.peigen.ssh.basemanage.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BaseData entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "baseData", catalog = "test", uniqueConstraints = {})
public class BaseData implements java.io.Serializable {

	// Fields

	private Integer id;
	private String typeName;
	private String remark;

	// Constructors

	/** default constructor */
	public BaseData() {
	}

	/** full constructor */
	public BaseData(Integer id, String typeName, String remark) {
		this.id = id;
		this.typeName = typeName;
		this.remark = remark;
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

	@Column(name = "TypeName", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Column(name = "remark", unique = false, nullable = false, insertable = true, updatable = true, length = 1000)
	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}