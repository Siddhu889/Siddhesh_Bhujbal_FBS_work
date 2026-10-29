package p1.My_2026_08_08SpringBootServices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServiceController {

	@GetMapping("/service/{userid}")
	public User getSingleuser(@PathVariable String userid)
	{
		String url="http://localhost:8080/user/"+userid;
		RestTemplate template=new RestTemplate();
		User obj=template.getforEntity(url, User.class).getBody();
		return obj;
	}
	
	
}
