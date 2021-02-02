import com.suftz.bean.User;
import com.suftz.config.SpringConfig;
import com.suftz.service.AccountService;
import com.suftz.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 8:30
 */
public class SpringTest2 {

    UserService userService;

    @Before
    public void init(){
        ApplicationContext context=new ClassPathXmlApplicationContext("day02/beans2.xml");
        userService=context.getBean("userService",UserService.class);
    }

    @Test
    public void testInsert(){
        User user=new User("刘备",null,"123sdfs","sky@suftz.com",null);
        userService.addUser(user);
        user=new User("诸葛亮",28,"123ssdfdfs","skyzhuge@suftz.com","古隆中");
        userService.addUser(user);
    }

    @Test
    public void testUpdate(){
        User user=new User("刘备",45,"123sdfs","sky@suftz.com","益州");
        user.setUid(1);
        userService.updateUser(user);
    }

    @Test
    public void testQuery(){
        Integer uid=1;
        User user=userService.getUserByUid(uid);
        System.out.println(user);
        uid=12344;
        user=userService.getUserByUid(uid);
        if(user!=null){
            System.out.println(user);
        }else{
            System.out.println("uid:"+uid+",该数据未找到");
        }
    }

    @Test
    public void testQueryAll(){
        System.out.println(userService.getAllUsers());
    }

    @Test
    public void testBatchUpdate(){
        List<Object[]> list=new ArrayList();
        list.add(new Object[]{60,"益州",1});
        list.add(new Object[]{60,"益州",2});
        userService.batchUpdate(list);
    }

    @Test
    public void testDelete(){
        userService.deleteUserByUid(1);
        userService.deleteUserByUid(12344);
    }

    @Test
    public void testAccountTransfer(){
        ApplicationContext context=new ClassPathXmlApplicationContext("day02/beans2.xml");
        AccountService accountService=context.getBean("accountService", AccountService.class);
        accountService.transferAccount(1001,1002,100);
    }

    @Test
    public void testAccountTransfer2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("day02/beans3.xml");
        AccountService accountService=context.getBean("accountService", AccountService.class);
        accountService.transferAccount(1001,1002,100);
    }

    @Test
    public void testAccountTransfer3(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService=context.getBean("accountService", AccountService.class);
        accountService.transferAccount(1001,1002,100);
    }
    @Test
    public void test(){
        //创建GenericApplicationContext对象
        GenericApplicationContext context=new GenericApplicationContext();
        //调用context的方法对象注册
        context.refresh();
        context.registerBean("user",User.class,()->new User());
        //获取在spring注册的对象
        User user=context.getBean("user",User.class);
        System.out.println(user);
    }
}
