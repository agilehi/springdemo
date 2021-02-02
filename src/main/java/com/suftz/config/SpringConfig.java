package com.suftz.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 19:46
 */
//@Configuration//作为配置类，替代xml配置文件
//@ComponentScan(basePackages = {"com.suftz"})//组件扫描
////@EnableAspectJAutoProxy(proxyTargetClass = true)//开启aop
//@EnableTransactionManagement//开启事务
public class SpringConfig {

    //创建数据库连接池:也会被放入ioc容器中管理
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?characterEncoding=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai");
        dataSource.setUsername("root");
        dataSource.setPassword("booksys123");
        dataSource.setMinEvictableIdleTimeMillis(300000);
        dataSource.setValidationQuery("SELECT 1");
        return dataSource;
    }

    //创建JdbcTemplate对象:也会被放入ioc容器中管理
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource){//参数说明：因为在ioc容器中已经创建了数据库连接池的对象，这里从ioc容器中取得
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return  jdbcTemplate;
    }

    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager transactionManager=new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}

/**
driverClass=com.mysql.cj.jdbc.Driver
url=jdbc:mysql://localhost:3306/spring?characterEncoding=utf8&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=Asia/Shanghai
username=root
password=booksys123
minEvictableIdleTimeMillis=300000
 alidationQuery=SELECT 1
 */