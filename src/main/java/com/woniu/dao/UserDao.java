package com.woniu.dao;

import com.woniu.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {
    List<User> selectAllUser();
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(Integer pkid);
    List<User> selectUserBy(
            @Param("account")String account,
            @Param("username")String username);
    List<User> sortAllUser(String columnName);
    int deleteById(Integer... ids);

}
