import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 17:20
 */
public class LogTest {
    private static final Logger log= LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        log.info("hello log4j2,I am {}","Tom");
        log.info("this is a test log info");
        log.warn("this is a test warn log");
        log.error("this is a test error log");
    }
}
