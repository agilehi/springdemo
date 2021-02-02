package com.suftz.factorybean;


import com.suftz.bean.Student;
import com.suftz.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 15:08
 */
public class MyBean  implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
