package com.gxw;

import com.gxw.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * spring jdbc测试类
 * @author GXW工作室
 * @date 2020/6/4 0004 - 00:21
 */
public class SpringTest {

    //创建main主程序入口
    public static void main(String[] args) throws Exception {
        //这是我们创建对象的方式
//        People people = new People();
//        people.setId(1);
//        people.setUsername("张三");
//        people.setSex("男");
//        System.out.printf(String.valueOf(people));

        //创建SpringTest对象
        SpringTest test = new SpringTest();
        //0.调用Jdbc连接测试
//        test.JdbcTest();

        //1.调用SpringApp测试
//        test.SpringAppTest();

        //2.实例工厂测试
//        test.PeopleFactoryTest();

        //3.静态工厂测试
//        test.PeopleStaticFactoryTest();

        //通过Set方法给对象赋值注入
        test.SetPeopleTest();

        //依赖注入(DI)
//        test.DIPhoneTest();
    }

    //jdbc连接测试
    public void JdbcTest() throws Exception{
        //1.注册驱动类
        //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatisdb", "root", "123456");
        //3.获取数据库操作预处理对象
        PreparedStatement ps = conn.prepareStatement("select * from user");
        //4.执行sql，得到结果集
        ResultSet rs = ps.executeQuery();
        //5.遍历结果集
        while (rs.next()) {
            System.out.println(rs.getInt("id"));
            System.out.println(rs.getString("username"));
            System.out.println(rs.getString("birthday"));
            System.out.println(rs.getString("sex"));
            System.out.println(rs.getString("address"));
        }
        //6.释放资源
        rs.close();
        ps.close();
        conn.close();
    }

    /**
     *  1.通过构造方法创建bean对象：
     *     实现ApplicationContext测试
     */
    public void SpringAppTest(){
        //创建ApplicationContext对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = ac.getBean("people", People.class);
        System.out.println("1.通过构造方法实现创建对象："+people);
    }


    /**
     * 2.通过实例工厂创建bean对象
     *     实现ApplicationContext测试
     */
     public void PeopleFactoryTest(){
         //创建ApplicationContext对象
         ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
         People people = ac.getBean("factory", People.class);
         System.out.println("2.通过实例工厂实现创建对象："+people);
     }


    /**
     * 3.通过静态工厂创建bean对象
     *     实现ApplicationContext测试
     *     在方法上添加上static静态即可
     */
    public void PeopleStaticFactoryTest(){
        //创建ApplicationContext对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = ac.getBean("staticfactory", People.class);
        System.out.println("3.通过静态工厂实现创建对象："+people);
    }


    /**
     * Spring中给对象进行赋值(注入)的方法
     *    通过Set方法赋值注入
     */
    public void SetPeopleTest(){
        //创建ApplicationContext对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = ac.getBean("people2", People.class);
        System.out.println("-->通过Set方法给对象赋值："+people);
    }


    /**
     * 依赖注入(DI)
     */
    public void DIPhoneTest(){
        //创建ApplicationContext对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        People people = ac.getBean("myphone", People.class);
        System.out.println("-->依赖注入："+people);
    }

}