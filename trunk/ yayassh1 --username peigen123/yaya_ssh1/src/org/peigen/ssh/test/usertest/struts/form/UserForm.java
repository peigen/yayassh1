package org.peigen.ssh.test.usertest.struts.form;

import org.apache.struts.action.ActionForm;

/**
 *                       
 *Filename:UserForm.java
 *
 *Description:
 *
 *Version:0.1
 *
 *Author: peigen
 *
 *Email: peigen_peigen@163.com
 *
 *Blog: http://blog.163.com/peigen_peigen
 *
 *       
 *History:
 *      [ Author             Date       Version     Content ]
 *        peigen        2008-09-02     0.1        create
 *
 */
public class UserForm extends ActionForm {

	/**
	 * 
	 */
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
	
	//setter--getter

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userPwd
	 */
	public String getUserPwd() {
		return userPwd;
	}

	/**
	 * @param userPwd the userPwd to set
	 */
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	/**
	 * @return the userSex
	 */
	public String getUserSex() {
		return userSex;
	}

	/**
	 * @param userSex the userSex to set
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	/**
	 * @return the userAge
	 */
	public Integer getUserAge() {
		return userAge;
	}

	/**
	 * @param userAge the userAge to set
	 */
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
}
