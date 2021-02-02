package com.suftz.bean;

        import org.springframework.beans.BeansException;
        import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 15:58
 */
public class MyBeanPosst implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行了beforeInit");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("执行了afterInit");
        return bean;
    }
}
