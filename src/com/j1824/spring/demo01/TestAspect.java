package com.j1824.spring.demo01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAspect {


    @Autowired
    @Qualifier("studentDao")
    private StudentDao studentDao;

    @Test
    public void testRun() {

        studentDao.add();

        System.out.println("----------------");

        studentDao.add("小黑");

    }


}
