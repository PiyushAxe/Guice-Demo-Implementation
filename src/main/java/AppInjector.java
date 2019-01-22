import com.google.inject.AbstractModule;

public class AppInjector extends AbstractModule {

	
	
	protected void configure() {
		
		bind(MessageService.class).to(FacebookService.class);
		//bind(MessageService.class).to(EmailService.class);
		
	}
}
