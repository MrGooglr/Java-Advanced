package tests.aniket.springboot.testspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import tests.aniket.springboot.testspringboot.consume.ConsumeClass;

@SpringBootApplication
public class TestspringbootApplication {

	private static final Logger log = LoggerFactory.getLogger(TestspringbootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TestspringbootApplication.class, args);
	}

	
	//for consumption
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}
	//for consumption
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			ConsumeClass quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", ConsumeClass.class);
			log.info(quote.toString());
		};
	}

}
