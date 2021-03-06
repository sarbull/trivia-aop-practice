package com.thalesgroup.trivia;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@ImportResource("classpath:services-config.xml")
public class ComponentConfig {

//	@Bean
//	public QuestionCollectionDAO collection() {
		// return new PersonCollectionDAO(new ArrayList<>(), 100);
//		return new QuestionCollectionDAO(new HashSet<>(), 10001);
//	}

	// @Bean
	// public PersonService service() throws FileNotFoundException {
	// return new PersonService(collection(), System.out);
	// // return new PersonService(collection(), new PrintStream(new BufferedOutputStream(new FileOutputStream("c:/tmp/spring.log")), true));
	// }

}
