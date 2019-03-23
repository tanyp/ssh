package cn.com.yunyoutianxia.simple.domain.factory.impl;

import cn.com.yunyoutianxia.simple.domain.common.AbstractHibernateDomain;
import cn.com.yunyoutianxia.simple.domain.factory.BaseDomainFactory;
import org.hibernate.IdentifierLoadAccess;
import org.hibernate.LockOptions;
import org.hibernate.Session;

import java.io.Serializable;

public class BaseDomainFactoryImpl extends AbstractHibernateDomain implements BaseDomainFactory {
	
	@Override
	@SuppressWarnings("unchecked")
	public <T> T get(Class<T> clazz, Serializable id) {
		Session session = getSession();
		return (T) session.get(clazz, id);
	}
	
	@Override
	@SuppressWarnings({"unchecked"})
	public <T> T getWithLock(Class<T> clazz, Serializable id) {
		Session session = getSession();
		return (T) session.get(clazz, id, LockOptions.UPGRADE);
	}

	@Override
	@SuppressWarnings("unchecked")
	public <T> T load(Class<T> clazz, Serializable id) {
		Session session = getSession();
		return (T) session.load(clazz, id);
	}
	
	@Override
	public <T> T lock(T entity) {
		sessionFactory.getCurrentSession().buildLockRequest(LockOptions.UPGRADE).lock(entity);
		return entity;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T merge(T entity) {
		return (T) sessionFactory.getCurrentSession().merge(entity);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T create(T entity) {
		Session session = sessionFactory.getCurrentSession();
		Serializable id = session.save(entity);
		return (T) session.get(entity.getClass(), id);
	}

	@Override
	public <T> void update(T entity) {
		Session session = sessionFactory.getCurrentSession();
		session.update(entity);
	}

	@Override
	public <T> T createOrUpdate(T entity) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(entity);
		return entity;
	}

	@Override
	public <T> void delete(Class<T> clazz, Serializable id) {
		Session session = sessionFactory.getCurrentSession();
		IdentifierLoadAccess<T> identifierLoadAccess = session.byId(clazz);
//		if(IDeleted.class.isAssignableFrom(clazz)){
//			Object entity = identifierLoadAccess.load(id);
//			if(entity == null){
//				return;
//			}
//			((IDeleted) entity).doDelete();
//			session.update(entity);
//		}else{
//			Object entity = identifierLoadAccess.getReference(id);
//			session.delete(entity);
//		}
	}

	@Override
	public <T> void delete(T entity) {
		Session session = sessionFactory.getCurrentSession();
//		if(entity instanceof IDeleted){
//			((IDeleted) entity).doDelete();
//			session.update(entity);
//		}else{
			session.delete(entity);
//		}
	}

}
