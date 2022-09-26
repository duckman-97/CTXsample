package ctxsample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
@ComponentScan(basePackages = "ctxsample")
public class ProjectConfig {
	
	
	
	@Bean
	@Primary
	Parrot parrot1() {
		var p = new Parrot();
		p.setName("Koko");
		return p;
		
	}
	
	
/*
	@Bean
	Parrot parrot2() {
		var p = new Parrot();
		p.setName("Miki");
		return p;
	}
	
	@Bean
	Parrot parrot3() {
		var p = new Parrot();
		p.setName("NANA");
		return p;
		
	}
	*/

}
