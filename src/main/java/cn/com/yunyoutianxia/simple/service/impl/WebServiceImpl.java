package cn.com.yunyoutianxia.simple.service.impl;

import cn.com.yunyoutianxia.simple.domain.entity.Firm;
import cn.com.yunyoutianxia.simple.repository.WebRepository;
import cn.com.yunyoutianxia.simple.service.WebService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tanyp on 2019/3/20
 */
@Service
public class WebServiceImpl implements WebService {

    @Autowired
    private WebRepository webRepository;

    @Override
    public void index() {
        Firm firm = webRepository.get(Firm.class, "1");
        System.out.println(new Gson().toJson(firm));
    }
}
