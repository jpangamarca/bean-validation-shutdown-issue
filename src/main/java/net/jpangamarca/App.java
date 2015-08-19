package net.jpangamarca;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;

import org.jboss.weld.environment.se.StartMain;
import org.jboss.weld.environment.se.events.ContainerInitialized;

/**
 * Hello world!
 *
 */
@ApplicationScoped
public class App {
	
    public static void main( String[] args ) {
    	StartMain startMain = new StartMain(args);
    	startMain.go();
    }
    
    private static final class Validate {
    	
		private final Integer value;
    	
    	Validate(Integer value) {
    		this.value = value;
    	}
    	
    	@NotNull
    	public Integer getValue() {
			return value;
		}
    	
    }
    
    public void startApp(@Observes ContainerInitialized ce, Validator validator) {
    	System.out.println("Hello from Weld");
    	Validate v = new Validate(null);
    	validator.validate(v).forEach(System.out::println);
    	System.out.println("Bye.");
    }
    
}
