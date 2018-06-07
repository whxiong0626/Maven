import com.whx.bean.User;
import com.whx.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        UserService service=context.getBean("userServiceImpl",UserService.class);
        User user = service.login("111111", "123456");
        System.out.println(user);
    }

}
