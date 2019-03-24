package cn.com.yunyoutianxia.simple.hibernate.repository.impl;

import cn.com.yunyoutianxia.simple.hibernate.domain.AbstractHibernateDomain;
import cn.com.yunyoutianxia.simple.hibernate.repository.BaseDomainRepository;
import org.hibernate.Session;

import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/20
 */
public class BaseDomainRepositoryImpl extends AbstractHibernateDomain implements BaseDomainRepository {

    @Override
    @SuppressWarnings("unchecked")
    public <T> T get(Class<T> clazz, Serializable id) {
        Session session = getSession();
        return session.get(clazz, id);
    }

    @Override
    public <T> T getWithLock(Class<T> clazz, Serializable id) {
        return null;
    }

    @Override
    public <T> T load(Class<T> clazz, Serializable id) {
        Session session = getSession();
        return session.load(clazz, id);
    }
}
