package cn.com.yunyoutianxia.simple.repository.impl;

import cn.com.yunyoutianxia.simple.domain.common.AbstractHibernateDomain;
import cn.com.yunyoutianxia.simple.repository.BaseDomainRepository;
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
    public <T> T load(Class<T> clazz, Serializable id) {
        Session session = getSession();
        return session.load(clazz, id);
    }
}
