package eureka.server;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class Application {
	
	private static Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
    	ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
    	String[] activeProfiles = run.getEnvironment().getActiveProfiles();
    	log.info("spring boot 使用的profile为{}",Arrays.deepToString(activeProfiles));
    	
    }
}