package com.linktree.sikehome;

import com.linktree.sikehome.entity.address;
import com.linktree.sikehome.mapper.base.addressBaseMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class YangliuApplicationTests {
    @Autowired
    addressBaseMapper addressBaseMapper;
    @Test
    void contextLoads() {
        address address = new address();
        address.builder().name("郭磊").code("编码0001").build();
        addressBaseMapper.insertaddress(address);
    }

}
