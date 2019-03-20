/***********************************************************************
 * 深圳市云游天下科技有限公司 版权所有
 ***********************************************************************/
package cn.com.yunyoutianxia.simple.domain.common;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.support.TransactionSynchronizationManager;

/**
 * @author 黄盛荣
 * @since 1.7
 * 	 新建 2014年10月6日
 */
public abstract class AbstractHibernateDomain {

    protected Logger logger = Logger.getLogger(getClass());
	
	@Autowired
	protected SessionFactory sessionFactory;

	protected void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
//		if (TransactionSynchronizationManager.isActualTransactionActive()) {
//			return sessionFactory.getCurrentSession();
//		} else {
//			throw new SystemException("方法没有开启事务");
//		}
		if (TransactionSynchronizationManager.isActualTransactionActive()) {
			return sessionFactory.getCurrentSession();
		} else {
			Session s = HibernateSessionHolder.getCurrentSession();
			if(s == null){
				s = sessionFactory.openSession();
				HibernateSessionHolder.setSession(s);
			}else if(!s.isOpen()){
				HibernateSessionHolder.remove();
				s = sessionFactory.openSession();
				HibernateSessionHolder.setSession(s);
			}else{
			}
			return s;
		}
	}

	public void flush() {
		if (TransactionSynchronizationManager.isActualTransactionActive()) {
			sessionFactory.getCurrentSession().flush();;
		} else {
			Session s = HibernateSessionHolder.getCurrentSession();
			if(s != null && s.isOpen()){
				s.flush();
			}
		}
	}
	
}
