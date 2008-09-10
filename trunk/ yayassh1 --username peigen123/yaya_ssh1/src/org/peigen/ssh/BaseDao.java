package org.peigen.ssh;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 *                       
 *Filename:BaseDao.java
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
public class BaseDao extends HibernateDaoSupport implements IBaseDao {

	/* 
	 * @see org.peigen.ssh.IBaseDao#delete(org.peigen.ssh.IBaseBean)
	 */
	public void delete(IBaseBean entity) {
		this.getHibernateTemplate().delete(entity);
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#deleteList(java.util.List)
	 */
	public void deleteList(List<IBaseBean> list) {
		this.getHibernateTemplate().deleteAll(list);
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#getListForPage(org.peigen.ssh.IBaseBean, int, int)
	 */
	public List<IBaseBean> getListForPage(IBaseBean entity, int firstResult, int maxResults) {
		return null;
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#getPage(int)
	 */
	public int getPage(int pageSize) {
		
		return 0;
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#getSize()
	 */
	public int getSize() {
		return 0;
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#insert(org.peigen.ssh.IBaseBean)
	 */
	public void insert(IBaseBean entity) {
		this.getHibernateTemplate().save(entity);
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#queryAll(org.peigen.ssh.IBaseBean)
	 */
	public List<IBaseBean> queryAll(IBaseBean entity) {
		return this.getHibernateTemplate().loadAll(entity.getClass());
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#queryByPk(org.peigen.ssh.IBaseBean, java.lang.Long)
	 */
	public IBaseBean queryByPk(IBaseBean entity, Long pk) {
		return (IBaseBean) this.getHibernateTemplate().get(entity.getClass(), pk);
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#queryByPk(org.peigen.ssh.IBaseBean, java.lang.Integer)
	 */
	public IBaseBean queryByPk(IBaseBean entity, Integer pk) {
		return (IBaseBean) this.getHibernateTemplate().get(entity.getClass(), pk);
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#queryForList(java.lang.String, org.peigen.ssh.IBaseBean)
	 */
	public List<IBaseBean> queryForList(String selectName, IBaseBean entity) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#queryForList(java.lang.String, java.lang.String, java.lang.String)
	 */
	public List<IBaseBean> queryForList(String beanName, String strConditionName, String strCondition) {
		// TODO Auto-generated method stub
		return null;
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#update(org.peigen.ssh.IBaseBean)
	 */
	public void update(IBaseBean entity) {
		this.getHibernateTemplate().saveOrUpdate(entity);
	}

	/* 
	 * @see org.peigen.ssh.IBaseDao#update(java.lang.String, org.peigen.ssh.IBaseBean)
	 */
	public void update(String statementName, IBaseBean entity) {
		// TODO Auto-generated method stub

	}

}
