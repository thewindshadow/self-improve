package com.gupaoedu.nginxdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
@RestController
public class IndexController {

    Logger logger= LoggerFactory.getLogger(IndexController.class);

    @GetMapping("getIp")
    public String getIp(HttpServletRequest request){
        String remoteAddr=request.getRemoteAddr();
        String ngip=request.getHeader("X-Real_IP");
        String param=request.getHeader("interface_version");
        return remoteAddr+"->"+ngip+"->"+param;
    }

}
