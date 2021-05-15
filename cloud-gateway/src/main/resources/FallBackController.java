import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@RequestMapping("/userServiceFallBack")
	public String userServiceFallBackMethod() {
		
		return "User service is taking more time than expected";
	}
	
	@RequestMapping("/departmentServiceFallBack")
	public String userServiceFallBackMethod() {
		
		return "Department service is taking more time than expected";
	}
}
