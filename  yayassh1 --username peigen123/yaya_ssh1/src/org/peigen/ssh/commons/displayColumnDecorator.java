package org.peigen.ssh.commons;

import javax.servlet.jsp.PageContext;

import org.displaytag.decorator.DisplaytagColumnDecorator;
import org.displaytag.exception.DecoratorException;
import org.displaytag.properties.MediaTypeEnum;

/**
 * 
 *Copyrights 1997-2008 西安协同时光软件有限公司
 *                       
 *Filename:displayColumnDecorator.java
 *
 *Description:
 *
 *Version:V0.1
 *
 *Author: peigen
 *       
 *History:
 *      [ Author             Date       Version     Content ]
 *        peigen        2008-07-29     V0.1        create
 *
 */
public class displayColumnDecorator implements DisplaytagColumnDecorator {

	/* 
	 * @see org.displaytag.decorator.DisplaytagColumnDecorator#decorate(java.lang.Object, javax.servlet.jsp.PageContext, org.displaytag.properties.MediaTypeEnum)
	 */
	public Object decorate(Object arg0, PageContext arg1, MediaTypeEnum arg2) throws DecoratorException {
		if(((String)arg0).equals("female")){
			return "美女";
		}else if(((String)arg0).equals("male")){
			return "帅哥";
		}
		return null;
	}


}
