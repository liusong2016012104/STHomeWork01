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

@CommonsLog
@Controller
public class LoginController {


    @GetMapping("/login/{id}")
    public String loginForm(@PathVariable("id")Integer id){
        log.info("login?method=get");
        log.info(id);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam(value = "username") Long username,
                        @RequestParam(value = "password") String password,
                        @RequestBody String json,
                        ServletRequest request, Model model) {
        log.info("login?method=post");

        log.info(username);

        log.info(json);

        return "loginsuccess";
    }
}

