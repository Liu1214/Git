package com.j1824.spring.demo02;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("userDao")
public class UserDao {

    @Autowired
    @Qualifier("sqlSession")
    private SqlSessionTemplate sqlSession;

    public User queryUser(int id) {
        UserDao2 mapper = sqlSession.getMapper(UserDao2.class);
//        User o = sqlSession.selectOne("com.j1824.spring.demo02.User.queryUser", id);
        return mapper.queryUser(id);
    }


}
