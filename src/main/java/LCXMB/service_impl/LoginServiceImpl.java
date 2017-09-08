package LCXMB.service_impl;

import LCXMB.dao.AdminMapper;
import LCXMB.dao.User_loginMapper;
import LCXMB.pojo.Admin;
import LCXMB.pojo.User_login;
import LCXMB.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 759517209@qq.com on 2017/9/7.
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    User_loginMapper user_loginMapper;

    public boolean verify(String name, String password) {
        User_login user_login = user_loginMapper.selectByPrimaryKey(name);
        if(user_login != null){
            if(user_login.getPassword() == password && user_login.getUsername() == name){
                return true;
            }
        }
        return false;
    }
}
