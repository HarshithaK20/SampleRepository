import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
	
	@Bean
	Engine engine()
	{
		Engine e=new Engine();
		e.setName("default");
		return e;
	}

}
