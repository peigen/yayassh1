package org.peigen.ssh.commons;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 
 * Copyrights 1997-2008 西安协同时光软件有限公司<br />
 * 
 * Filename:SetEncodeFilter.java<br />
 * 
 * Description:字符过滤器<br />
 * 
 * Version:V0.1<br />
 * 
 * Author: peigen<br />
 * 
 * History: <br />
 * [ Author 	   Date 	Version	 Content ]<br /> 
 *   peigen 	2008-07-29	 V0.1 	  create <br />
 * 
 */
public class SetEncodeFilter implements Filter {

	protected FilterConfig filterConfig = null;

	protected String defaultEncoding = null;

	public void init(FilterConfig arg0) throws ServletException {
		this.filterConfig = arg0;
		this.defaultEncoding = filterConfig.getInitParameter("defaultencoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		chain.doFilter(request, response);
	}

	public void destroy() {

		this.defaultEncoding = null;
		this.filterConfig = null;
	}

}
