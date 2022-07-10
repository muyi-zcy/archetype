#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * description: 服务健康检查
 * author: muyi
 * version: 1.0
 */

@RestController
public class OkController {

    private static final Logger logger = LoggerFactory.getLogger(OkController.class);

    @GetMapping("/ok")
    public Object ok(HttpServletRequest httpRequest) {
        return "ok";
    }
}
