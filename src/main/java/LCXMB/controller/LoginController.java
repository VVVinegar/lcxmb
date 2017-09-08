package LCXMB.controller;

import LCXMB.pojo.User_login;
import LCXMB.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by 759517209@qq.com on 2017/9/7.
 */
@Controller
@RequestMapping("")
@Scope("prototype")
public class LoginController {

    @Resource
    LoginService loginService;

    @RequestMapping("*/login")
    public String login(User_login user_login, HttpServletRequest request){
        boolean result = loginService.verify(user_login.getUsername(), user_login.getPassword());
        if (result){

        }else{

        }
    }
}
