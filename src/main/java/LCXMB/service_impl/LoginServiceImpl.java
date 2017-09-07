package LCXMB.service_impl;

import LCXMB.dao.AdminMapper;
import LCXMB.pojo.Admin;
import LCXMB.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 759517209@qq.com on 2017/9/7.
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    AdminMapper adminMapper;

    public boolean verify(String name, String password) {
        Admin admin = adminMapper.selectByPrimaryKey(name);
        return false;
    }
}
