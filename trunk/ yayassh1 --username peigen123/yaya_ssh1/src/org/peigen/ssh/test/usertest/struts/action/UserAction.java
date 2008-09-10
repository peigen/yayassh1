package org.peigen.ssh.test.usertest.struts.action;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.log4j.Logger;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.peigen.ssh.test.usertest.commons.Constants;
import org.peigen.ssh.test.usertest.entity.TUser;
import org.peigen.ssh.test.usertest.service.UserService;
import org.peigen.ssh.test.usertest.struts.form.UserForm;



/**
 *                       
 *Filename:UserAction.java
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
public class UserAction extends DispatchAction {
	//实体
	private TUser user;
	
	//业务方法
	private UserService userService;
	
	//log
	private Logger log = Logger.getLogger(this.getClass());
	
	/**
	 * 用户列表
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public ActionForward listUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		log.debug("listUser");
		user = this.getUser(form);

		List<TUser> userList = (List) userService.getAllObject(user);
		request.setAttribute(Constants.USERLIST, userList);

		return mapping.findForward(Constants.SUCCESS);
	}
	
	public ActionForward toAddUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		return mapping.findForward(Constants.SUCCESS);
	}
	
	public ActionForward addUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		user = this.getUser(form);
		this.userService.insertObject(user);
		
		return mapping.findForward(Constants.SUCCESS);
	}
	
	public ActionForward toUpdateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		user = this.getUser(form);
		user = (TUser) this.userService.getObject(user, user.getUserId());
		
		request.setAttribute(Constants.USER, user);
		return mapping.findForward(Constants.SUCCESS);
	}
	
	public ActionForward updateUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		user = this.getUser(form);
		this.userService.updateObject(user);
		
		return mapping.findForward(Constants.SUCCESS);
	}
	
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, InvocationTargetException {
		user = this.getUser(form);
		this.userService.deleteObject(user);
		
		return mapping.findForward(Constants.SUCCESS);
	}

	//setter--getter
	/**
	 * @return the user
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 */
	public TUser getUser(ActionForm form) throws IllegalAccessException, InvocationTargetException {
		UserForm userForm = (UserForm) form;
		user = new TUser();
		BeanUtils.copyProperties(user, userForm);
		
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(TUser user) {
		this.user = user;
	}

	/**
	 * @return the userService
	 */
	public UserService getUserService() {
		return userService;
	}

	/**
	 * @param userService the userService to set
	 */
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
