package LCXMB.pojo;

import LCXMB.dao.AdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by 759517209@qq.com on 2017/9/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")

public class AdminTest {

    @Autowired
    AdminMapper adminMapper;

    @Test
    public void testAdmin(){
        System.out.print("begin");
        adminMapper.insert(new Admin("gaoxiang", "123"));
    }
}