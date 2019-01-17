import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AnnotationExample {

	public static void main(String[] args) {
		
try(AbstractApplicationContext ctx=new AnnotationConfigApplicationContext(AnnotationConfig.class)){
 Engine e=ctx.getBean(Engine.class);
 System.out.println(e.getName());
 //Car c=ctx.getBean(Car.class);
//System.out.println(e.getName());
		

	}

}
}
