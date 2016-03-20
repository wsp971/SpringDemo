package wsp.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view/test")
public class TestController {
	@RequestMapping("view/test/bye.action")
	public String test(){
		System.out.println("test");
		return "test";
	}
	
}
