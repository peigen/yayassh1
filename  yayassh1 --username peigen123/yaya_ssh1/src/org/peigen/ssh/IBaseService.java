package org.peigen.ssh;

import java.util.List;

/**
 *                       
 *Filename:IBaseService.java
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
public interface IBaseService {

	/**
	 * 新增业务方法
	 * @param baseBean
	 */
	public abstract void insertObject(IBaseBean baseBean);

	/**
	 * 获取全部业务方法
	 * @param baseBean
	 * @return List<IBaseBean>
	 */
	@SuppressWarnings("unchecked")
	public abstract List<IBaseBean> getAllObject(IBaseBean baseBean);

	/**
	 * 分页程序业务方法
	 * 
	 * @param entity
	 *            要查询的实体
	 * @param firstResult
	 *            开始取数据的下标
	 * @param maxResults
	 *            读取数据记录数
	 * @return List<IBaseBean> 结果集
	 */
	public abstract List<IBaseBean> getListForPage(IBaseBean entity,
			final int firstResult, final int maxResults);

	/**
	 * 更新业务方法
	 * @param baseBean
	 */
	public abstract void updateObject(IBaseBean baseBean);

	/**
	 * 删除业务方法
	 * @param baseBean
	 */
	public abstract void deleteObject(IBaseBean baseBean);

}