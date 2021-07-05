package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HelloController {
	
	@GetMapping("hello") //url Get방식
	public String hello(Model model) {
		model.addAttribute("data", "spring!");
		return "hello";
		// templates/hello.html Thymeleaf템플릿 엔진 처리(viewResolver)
	}
}
