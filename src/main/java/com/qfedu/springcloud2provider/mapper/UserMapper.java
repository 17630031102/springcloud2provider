package com.qfedu.springcloud2provider.mapper;

import com.qfedu.springcloud2provider.domain.User;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    //新增
    @Select("insert into t_user(username,password) values(#{username},#{password})")
    int insert(User user);

    //查询
    @Select("select * from t_user where username = #{username}")
    @ResultType(User.class)
    List<User> selectAll(String username);
}
