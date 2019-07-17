package com.john.batch;

import com.yiche.batch.SparkJob1;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@EnableScheduling
@Component
public class dingshiqi {

    @Scheduled(cron="0 0/1 * * * ?")
    public void testOne() {
        System.out.println("每分钟执行一次");
        SparkJob1 sj=new SparkJob1();
        sj.test();
    }
}