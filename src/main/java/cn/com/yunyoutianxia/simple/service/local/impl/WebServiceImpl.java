package cn.com.yunyoutianxia.simple.service.local.impl;

import cn.com.yunyoutianxia.simple.domain.entity.Simple;
import cn.com.yunyoutianxia.simple.domain.factory.WebFactory;
import cn.com.yunyoutianxia.simple.repository.WebRepository;
import cn.com.yunyoutianxia.simple.service.local.WebService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by tanyp on 2019/3/20
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,readOnly = true,rollbackFor = Exception.class)
public class WebServiceImpl implements WebService {

    @Autowired
    private WebRepository repository;
    @Autowired
    private WebFactory factory;

    @Override
    public void index() {
        Simple simple = repository.get(Simple.class, "1");
        if (simple != null){
            System.out.println(new Gson().toJson(simple));
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void save() {
        Simple simple = new Simple();
        simple.setId("1");
        simple.setName("dev.tanyp@gmail.com");
        simple.setStatus(2);
        factory.create(simple);
    }
}
