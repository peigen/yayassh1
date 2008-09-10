package org.peigen.ssh;

import java.util.List;

/**
 *                       
 *Filename:IBaseDao.java
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
public interface IBaseDao {


	public void insert(IBaseBean entity);

	public void delete(IBaseBean entity);
	
	public void deleteList(List<IBaseBean> list);

	public void update(IBaseBean entity);

	public void update(String statementName, IBaseBean entity);
	
	public IBaseBean queryByPk(IBaseBean entity, Long pk);
	
	public IBaseBean queryByPk(IBaseBean entity, Integer pk);
	
	public List<IBaseBean> queryAll(IBaseBean entity);
	
	public List<IBaseBean> queryForList(String selectName, IBaseBean entity);

	public List<IBaseBean> queryForList(String beanName,
			String strConditionName, String strCondition);
	
	public int getSize();

	public int getPage(int pageSize);

	public List<IBaseBean> getListForPage(IBaseBean entity, final int firstResult,
			final int maxResults);

}
