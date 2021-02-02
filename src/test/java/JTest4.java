import com.suftz.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 18:05
 */
@RunWith(SpringJUnit4ClassRunner.class)  //单元测试框架
@ContextConfiguration(locations = {"classpath:././day02/beans3.xml"})  //加载配置文件
public class JTest4 {
    @Autowired
    private AccountService accountService;

    @Test
    public void testTransferAccount(){
        accountService.transferAccount(1001,1002,100);
    }
}
