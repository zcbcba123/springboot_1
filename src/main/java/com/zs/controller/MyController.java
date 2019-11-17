package com.zs.controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//
@Controller
public class MyController {
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String hello(){
        // 直接将json信息打印出来
//        System.out.println(jsonParam.toJSONString());

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", "zz");

        return result.toJSONString();
    }
}
