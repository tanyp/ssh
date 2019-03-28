package cn.com.yunyoutianxia.simple.hibernate.domain.impl;

import cn.com.yunyoutianxia.simple.hibernate.domain.AbstractHibernateDomain;
import cn.com.yunyoutianxia.simple.hibernate.domain.BaseDomainFactory;
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
			Object entity = identifierLoadAccess.getReference(id);
			session.delete(entity);
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

//	@SuppressWarnings("rawtypes")
//	protected void setParamPair(Query query, ParamPair paramPair) {
//		if (paramPair != null && paramPair.size() > 0) {
//			Set<String> keys = paramPair.keySet();
//			for (String key : keys) {
//				Object value = paramPair.get(key);
//				if (value.getClass().isArray()) {
//					query.setParameterList(key, (Object[]) value);
//				} else if (Collection.class.isAssignableFrom(value.getClass())) {
//					query.setParameterList(key, (Collection) value);
//				} else {
//					query.setParameter(key, value);
//				}
//			}
//		}
//	}

//	protected int executeByHQL(String hql, ParamPair paramPair,
//							   Callback callback) {
//		Session session = sessionFactory.getCurrentSession();
//		Query query = session.createQuery(hql);
//		setParamPair(query, paramPair);
//		if (callback != null) {
//			callback.before(session, query);
//		}
//		return query.executeUpdate();
//	}
//
//	protected int executeByHQL(String hql, ParamPair paramPair) {
//		return executeByHQL(hql, paramPair, null);
//	}


}
