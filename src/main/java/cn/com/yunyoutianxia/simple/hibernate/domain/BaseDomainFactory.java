package cn.com.yunyoutianxia.simple.hibernate.domain;

import org.hibernate.Session;

import java.io.Serializable;

public interface BaseDomainFactory {

	<T> T get(Class<T> clazz, Serializable id);

	<T> T getWithLock(Class<T> clazz, Serializable id);

	<T> T load(Class<T> clazz, Serializable id);

	<T> T lock(T entity);

	<T> T create(T entity);

	<T> void update(T entity);

	<T> T createOrUpdate(T entity);

	<T> void delete(Class<T> clazz, Serializable id);

	<T> void delete(T entity);

	void flush();

	<T> T merge(T entity);

	Session getSession();
	
}
