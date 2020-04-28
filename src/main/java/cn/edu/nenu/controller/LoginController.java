package cn.edu.nenu.controller;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletRequest;

/**
 * LoginController Class
 *
 * @author <b>Oxidyc</b>, Copyright &#169; 2003
 * @version 1.0, 2020-03-04 22:05
 */
@CommonsLog
@Controller
//@RequestMapping("/login")
public class LoginController {

    //@RequestMapping(value = {"/index","/"},method = RequestMethod.GET)
    //@RequestMapping("/index")
    //@GetMapping("/index")
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        String url = "http://localhost:8080/index";
        String url1 = "http://localhost:8080/login/index";
        String url2 = "http://localhost:8080/logingshibai/index";

        log.info(url);
        return "index";
    }

    /*
     * 1. 用户点击请求链接
     * 2. controller -> URL -> Get/Post Method
     * 3. 接收参数，处理业务，形成Model
     * 4. 返回viewName， viewResolver + viewName => project相对地址 prefix + viewName + suffix
     * 5. viewName的文件中进行渲染数据
     *
     * 开发顺序： 1-> 5 (正序) 或者 5 -> 1 （逆序）
     */


    //@RequestMapping(value = "/login",method = RequestMethod.GET)
    @GetMapping("/login/{id}")
    public String loginForm(@PathVariable("id")Integer id){
        log.info("login?method=get");
        log.info(id);
        return "login";
    }

    //@RequestMapping(value = "/login",method = RequestMethod.POST)
    @PostMapping("/login")
    public String login(@RequestParam(value = "username") Long username,
                        @RequestParam(value = "password") String password,
                        @RequestBody String json,
                        ServletRequest request, Model model) {
        log.info("login?method=post");
        //String username = request.getParameter("username");
        log.info(username);

        log.info(json);

        return "loginsuccess";
    }
}

