import com.suftz.bean.Employee;
import com.suftz.bean.Student;
import com.suftz.bean.User;
import com.suftz.config.SpringConfig;
import com.suftz.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 8:30
 */
public class SpringTest1 {
    @Test
    public void test1(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans.xml");
        User user=act.getBean("user", User.class);
        System.out.println(user);//User{name='Smith', age=33, email='sys@suftz.com'}

        user.setEmail("sys@qq.com");
     //   user.setName("Tom");
        user.setAge(20);
        System.out.println(user);//User{name='Tom', age=20, email='sys@qq.com'}
    }

    @Test
    public void test2(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans2.xml");
        UserService userService=act.getBean("userService", UserService.class);
       // userService.add();
        //打印：
        //userDao add...
        //userService add...
    }

    @Test
    public void test3(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans3.xml");
        Employee employee=act.getBean("employee",Employee.class);
        System.out.println(employee);//Employee{empName='雷军', dept=Department{deptName='研发二部'}}
    }

    @Test
    public void test4(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans4.xml");
        Student stu=act.getBean("stu", Student.class);
        System.out.println(stu.hashCode());
        //Student{courses=[语文, 数学, 英语], list=[张三, 李四, 王五], set=[Java, php, C++], map={key1=value1, key2=value2, key3=value3}}
        //Student{courses=[语文, 数学, 英语], list=[张三, 李四, 王五], set=[Java, php, C++], map={key1=value1, key2=value2, key3=value3},
        // courseLisst=[Course{courseName='大学数学'}, Course{courseName='大学英语'}, Course{courseName='大学体育'}]}
    }

    @Test
    public void test5(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans5.xml");
        User user=act.getBean("myBean", User.class);
        System.out.println(user);
    }

    @Test
    public void test6(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans6.xml");
        User user=act.getBean("user", User.class);
        System.out.println("第四步：使用user对象");

        //手动销毁这个bean，用于测试整个生命周期
        ((ClassPathXmlApplicationContext)act).close();
    }

//    @Test
//    public void test7(){
//        ApplicationContext act=new ClassPathXmlApplicationContext("beans7.xml");
//        UserDao userDao=act.getBean("userDao", UserDao.class);
//        userDao.printDataSource();
//    }

    @Test
    public void test8(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans8.xml");
        UserService userService=act.getBean("userService", UserService.class);
        System.out.println(userService);
        //userService.add();
    }

    @Test
    public void test9(){
        ApplicationContext act=new ClassPathXmlApplicationContext("day01/beans8.xml");
        User user=act.getBean("user", User.class);
        System.out.println(user);//User{name='Tom', age=22, email='skysha@suftz.com', address='长安城'}
    }

    @Test
    public void test10(){
        ApplicationContext act=new AnnotationConfigApplicationContext(SpringConfig.class);
        User user=act.getBean("user",User.class);
        System.out.println(user);
    }
}
