package com.linktree.sikehome;

import com.linktree.sikehome.entity.Address;
import com.linktree.sikehome.entity.User;
import com.linktree.sikehome.mapper.AddressMapper;
import com.linktree.sikehome.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
class YangliuApplicationTests {
    @Autowired
    AddressMapper addressMapper;
    @Autowired
    UserMapper userMapper;
    @Autowired
    RedisTemplate  redisTemplate;
    @Test
    void contextLoads() {
        Address address1 = Address.builder().name("郭磊112XXX").code("213").pid("2133").lit(2).build();
        addressMapper.insertSelective(address1);
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
    @Test
    void testRedis(){
        redisTemplate.opsForValue().set("username","杨柳");
        log.info("插入成功");
    }
    @Test
    void getRedis(){
        String username = redisTemplate.opsForValue().get("username").toString();
        log.info("redis:{}",username);
    }

}
