package com.linktree.sikehome;

import com.google.common.base.Stopwatch;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.util.StopWatch;

@SpringBootApplication
@Slf4j
public class YangliuApplication {


    public static void main(String[] args) {
        log.info("ITSOURCE启动....{}",Thread.currentThread().getName());
        Stopwatch started = Stopwatch.createStarted();
        new SpringApplicationBuilder().bannerMode(Banner.Mode.OFF)
               .sources(YangliuApplication.class)
               .run(args);
        log.info("项目启动成功,耗时:{}",started.toString());
    }
}
