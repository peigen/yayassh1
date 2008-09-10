package org.peigen.ssh.test.usertest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.peigen.ssh.IBaseBean;

/**
 * TUser entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_user", catalog = "test", uniqueConstraints = {})
public class TUser implements IBaseBean {

	private static final long serialVersionUID = 1L;

	// userId
	private Integer userId;

	// 用户名
	private String userName;

	// 用户密码
	private String userPwd;

	// 用户性别
	private String userSex;

	// 用户年龄
	private Integer userAge;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** minimal constructor */
	public TUser(Integer userId, String userName, String userPwd) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
	}

	/** full constructor */
	public TUser(Integer userId, String userName, String userPwd, String userSex, Integer userAge) {
		this.userId = userId;
		this.userName = userName;
		this.userPwd = userPwd;
		this.userSex = userSex;
		this.userAge = userAge;
	}

	// Property accessors
	@Id
	@Column(name = "user_id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(name = "user_name", unique = false, nullable = false, insertable = true, updatable = true, length = 20)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "user_pwd", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	@Column(name = "user_sex", unique = false, nullable = true, insertable = true, updatable = true, length = 10)
	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	@Column(name = "user_age", unique = false, nullable = true, insertable = true, updatable = true)
	public Integer getUserAge() {
		return this.userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

}