package in.ajay.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ajay.constants.AppConstants;
import in.ajay.props.AppProperties;

@RestController
public class MsgRestController {
	
	@Autowired
	private AppProperties appProps;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		 return appProps.getMessages().get(AppConstants.Welcome_Msg_Key);
		// return messages.get("welcomeMsg");
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = appProps.getMessages();
		return messages.get(AppConstants.Greet_Msg_Key);
	}
}
