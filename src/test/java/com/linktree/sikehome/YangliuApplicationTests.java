package com.linktree.sikehome;

import com.linktree.sikehome.entity.User;
import com.linktree.sikehome.entity.address;
import com.linktree.sikehome.mapper.UserMapper;
import com.linktree.sikehome.mapper.base.addressBaseMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
class YangliuApplicationTests {
    @Autowired
    addressBaseMapper addressBaseMapper;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        address address1 = address.builder().name("郭磊112XXX").code("213").pid("2133").lit(2).build();
        addressBaseMapper.insertaddress(address1);
    }
    @Test
    void testUser() {
//        User user = User.builder().password("123").id(453031453060497408L).name("杨柳").createTime(new Date()).phone("123").cityId(5).email("213").sex(2).loginName("213").build();
//        userBaseMapper.updateUser(user);
        User user =new User();
        user.setCityId(4);
        user.setCreateTime(new Date());
//        user.setSex(true);
        user.setLoginName("杨柳");
        userMapper.insertSelective(user);
    }
    @Test
    void queryUser() {
//        User user = User.builder().password("123").id(453031453060497408L).name("杨柳").createTime(new Date()).phone("123").cityId(5).email("213").sex(2).loginName("213").build();
//        userBaseMapper.updateUser(user);

        System.out.println(userMapper.selectByPrimaryKey(453038159261859840L));
    }
}
