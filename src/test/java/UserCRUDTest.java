import cn.summerwaves.domain.User;
import cn.summerwaves.factory.SWSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by summerwaves on 2017/7/12.
 */

public class UserCRUDTest {

    @Test
    public void insertTest() {
        SqlSession sqlSession = SWSessionFactory.getSqlSession();
        User user = new User("zhang","QQQ1215",2);
        sqlSession.insert("cn.summerwaves.mapper.UserMapper.saveUser", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("Success");
    }
}
