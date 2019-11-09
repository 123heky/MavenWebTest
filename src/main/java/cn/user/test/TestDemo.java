//package cn.user.test;
//
//import cn.user.dao.UserDao;
//import cn.user.domain.User;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//import java.io.InputStream;
//
//@Component
//public class TestDemo {
//    @Autowired
//    UserDao userDao;
//
//    public void test(){
//        System.out.println(userDao);
//        System.out.println(userDao.selectUserList());
//    }
//    public static void main(String[] args) throws IOException {
//        ApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
//
//        TestDemo testDemo = ac.getBean("testDemo", TestDemo.class);
//        testDemo.test();
//    }
//}
