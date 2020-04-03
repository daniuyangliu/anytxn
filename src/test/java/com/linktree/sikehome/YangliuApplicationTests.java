package com.linktree.sikehome;

import com.linktree.sikehome.entity.User;
import com.linktree.sikehome.entity.address;
import com.linktree.sikehome.mapper.base.UserBaseMapper;
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
    UserBaseMapper userBaseMapper;
    @Test
    void contextLoads() {
        address address1 = address.builder().name("郭磊112XXX").code("213").pid("2133").build();
        addressBaseMapper.insertaddress(address1);
    }
    @Test
    void testUser() {
        User user = User.builder().password("123").name("杨柳").createTime(new Date()).phone("123").cityId(5).email("213").sex(2).loginName("213").build();
        userBaseMapper.save(user);
    }
}
