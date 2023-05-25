package mongodbexample;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongodbexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbexampleApplication.class, args);
		System.out.println("mongodb ");
	}

}
