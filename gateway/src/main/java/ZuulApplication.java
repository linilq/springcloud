import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lizhijian
 * @description
 * @date 2020/2/13
 */
@EnableZuulProxy  // 包含了多个注解包含了EnableZuulServer
@EnableAutoConfiguration  // 可以帮助spring boot应用将所有符合条件的@Configration配置，加载到当前的IOC容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
