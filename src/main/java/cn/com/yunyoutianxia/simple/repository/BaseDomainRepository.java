package cn.com.yunyoutianxia.simple.repository;

import java.io.Serializable;

/**
 * Created by tanyp on 2019/3/20
 */
public interface BaseDomainRepository {

    <T> T get(Class<T> clazz, Serializable id);
}
