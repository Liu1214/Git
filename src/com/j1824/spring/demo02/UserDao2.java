package com.j1824.spring.demo02;

import org.apache.ibatis.annotations.Select;

public interface UserDao2 {

    @Select("select * from user where id = #{id}")
    User queryUser(int id);


}
