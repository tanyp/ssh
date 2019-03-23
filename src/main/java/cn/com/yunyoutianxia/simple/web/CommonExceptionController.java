package cn.com.yunyoutianxia.simple.web;

import cn.com.yunyoutianxia.simple.json.JSONResultModel;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * Created by tanyp on 2019/3/16
 */
@ControllerAdvice
public class CommonExceptionController {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JSONResultModel<Object> ex(Exception e) {
        JSONResultModel<Object> resultModel = new JSONResultModel<>();
        resultModel.setRet(false);
        String uuid = UUID.randomUUID().toString();
        if (StringUtils.isEmpty(e.getMessage())) {
            resultModel.setMsg(e.getMessage() + "  mark: " + uuid);
        } else {
            resultModel.setMsg(e.getClass().getName() + "  mark: " + uuid);
        }
        e.printStackTrace();
        return resultModel;
    }
}
