package com.linktree.sikehome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YangliuApplication {

    /*
    *  SpringApplication.run(YangliuApplication.class, args);
    *  List<User> list = Arrays.asList(User.builder().name("郭磊").password("123").build(),User.builder().name("杨柳").password("456").build());
    * System.out.println(list.stream().filter(list1 -> list1.getName().equals("郭磊")).findAny().get());
    * System.out.println(list.stream().map(User::getPassword).reduce((a,b)->a.concat("-").concat(b)).get());
    * */
    public static void main(String[] args) {
        SpringApplication.run(YangliuApplication.class, args);
    }
}
