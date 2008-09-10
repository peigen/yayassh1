package org.peigen.ssh;

import java.util.List;


/**
 *                       
 *Filename:BaseService.java
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
public class BaseService implements IBaseService {
	/**
	 * Dao对象
	 */
	private BaseDao baseDao;
	
	/**
	 * 新增业务方法
	 * @param baseBean
	 */
	public void insertObject(IBaseBean entity){
		this.baseDao.insert(entity);
	}
	
	/**
	 * 获取通过主键ID单个实体
	 * @param IBaseBean
	 * @param Long
	 * @return IBaseBean
	 */
	public IBaseBean getObject(IBaseBean entity, Long pk){
		
		return this.baseDao.queryByPk(entity, pk);
	}
	
	/**
	 * 获取通过主键ID单个实体
	 * @param IBaseBean
	 * @param Long
	 * @return IBaseBean
	 */
	public IBaseBean getObject(IBaseBean entity, Integer pk){
		
		return this.baseDao.queryByPk(entity, pk);
	}
	
	/**
	 * 获取全部业务方法
	 * @param baseBean
	 * @return List<IBaseBean>
	 */
	@SuppressWarnings("unchecked")
	public List<IBaseBean> getAllObject(IBaseBean entity){
		
		return this.baseDao.queryAll(entity);
	}
	
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
	public List<IBaseBean> getListForPage(IBaseBean entity, final int firstResult,
			final int maxResults){
		
		return this.baseDao.getListForPage(entity, firstResult, maxResults);
	}

	/**
	 * 更新业务方法
	 * @param baseBean
	 */
	public void updateObject(IBaseBean entity){
		this.baseDao.update(entity);
	}
	
	/**
	 * 删除业务方法
	 * @param baseBean
	 */
	public void deleteObject(IBaseBean entity){
		this.baseDao.delete(entity);
	}
	
	/**
	 * 删除list里的对象数据的业务方法
	 * @param list
	 */
	public void deleteObjectList(List<IBaseBean> list){
		this.baseDao.deleteList(list);
	}

	// get--set
	/**
	 * @return the baseDao
	 */
	public BaseDao getBaseDao() {
		return baseDao;
	}

	/**
	 * @param baseDao the baseDao to set
	 */
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	
	

}
