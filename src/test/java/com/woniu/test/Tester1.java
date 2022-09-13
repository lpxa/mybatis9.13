package com.woniu.test;

import com.woniu.dao.UserDao;
import com.woniu.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Tester1 {
    SqlSessionFactory sessionFactory = null;
    @Before
    public void fun1() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(in);
    }

    @Test
    public void test1() throws IOException {
        SqlSession session = sessionFactory.openSession(true);
        UserDao mapper = session.getMapper(UserDao.class);
//        List<User> users = mapper.selectUserBy("r", "十");
//        System.out.println(users);
//        List<User> users1 = mapper.selectAllUser();
//        System.out.println(users1);
        List<User> id = mapper.sortAllUser("user_account");
        System.out.println(id);
    }

}
