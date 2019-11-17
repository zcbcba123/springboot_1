package com.zs.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

//
@Controller
public class MyController {
    @ResponseBody
    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces = "application/json;charset=UTF-8")
    public String hello(String args){
        // 直接将json信息打印出来
        System.out.println(args);

        // 将获取的json数据封装一层，然后在给返回
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("method", "@ResponseBody");
        result.put("data", "zz");

        return result.toJSONString();
    }

    @ResponseBody
    @RequestMapping(value = "/listbody",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String listbody(@RequestBody String postbody){
        // 直接将json信息打印出来
        System.out.println(postbody);

        return postbody+"过了服务器后";
    }

    @ResponseBody
    @RequestMapping(value = "/post_sink",method = RequestMethod.POST,produces = "text/x-markdown;charset=UTF-8")
    public String post_sink(@RequestBody InputStream inputStream){
        String result = "";
        try {
            ByteArrayOutputStream outSteam = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];

            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outSteam.write(buffer, 0, len);
            }

            outSteam.close();
            inputStream.close();

            result = new String(outSteam.toByteArray(), "UTF-8");

        } catch (IOException e) {
            e.printStackTrace();
        }


        return result;
    }
}
