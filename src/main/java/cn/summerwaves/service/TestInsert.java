package cn.summerwaves.service;

import cn.summerwaves.domain.User;
import cn.summerwaves.factory.SWSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by summerwaves on 2017/7/10.
 */
public class TestInsert {
    public static void main(String[] args) throws Exception {
        SqlSession session = SWSessionFactory.getSqlSession();
        User user = new User("wang","1215",1);
        session.insert("cn.summerwaves.mapper.UserMapper.saveUser", user);
        session.commit();
        session.close();
        System.out.println("addUser");

    }
}
