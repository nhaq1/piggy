package haq.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// controls home page


//@RestController = @Controller + @ ResponseBody
@Controller   // controller for regular web page
public class HomeController {
	
	@RequestMapping("/")  //
	public String index(Model model) { // Model is used to pass information back and forth with UI
		
		model.addAttribute("message", "Hi there!");  // gets passed to hello.html template
		
		return "hello";  // @RestController returns String "hello"
						 // @Controller returns name for template file (i.e. hello.html)
		
	}
	

}
