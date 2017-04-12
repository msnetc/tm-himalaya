package cn.mobilemd.tmhimalaya;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TmhimalayaApplication {
	private static Logger logger = LogManager.getLogger(TmhimalayaApplication.class);
	public static void main(String[] args) {
		logger.info("jerry: application start");
		SpringApplication.run(TmhimalayaApplication.class, args);
	}
}
