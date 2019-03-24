package cn.com.yunyoutianxia.simple.hibernate.repository;

import org.hibernate.Session;

import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/20
 */
public interface BaseDomainRepository {

    <T> T get(Class<T> clazz, Serializable id);

    <T> T getWithLock(Class<T> clazz, Serializable id);

    <T> T load(Class<T> clazz, Serializable id);

    Session getSession();
}
