import com.suftz.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 18:05
 */
//@ExtendWith(SpringExtension.class)  //单元测试框架
//@ContextConfiguration(locations = {"classpath:././day02/beans3.xml"})  //加载配置文件

//上面两个注解可以使用下面一个注解代替
@SpringJUnitConfig(locations = {"classpath:././day02/beans3.xml"})
public class JTest5 {
    @Autowired
    private AccountService accountService;

    @Test
    public void testTransferAccount(){
        accountService.transferAccount(1001,1002,100);
    }
}
