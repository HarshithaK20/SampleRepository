import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	//@Qualifier("specialEngine")
   private Engine engine;
	
	@Override
	public String toString()
	{
		//return "Car with Engine: " + this.specialEngine.getName();
		return "Car with Engine: " + this.engine.getName();
	}
}