import com.spring.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zjr
 * @Create 2022-11-16  14:07
 */

public class test {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
         User user1=(User) context.getBean("user");
         User user2=(User) context.getBean("user");
         System.out.println(user1);
         System.out.println(user2);
    }
}
