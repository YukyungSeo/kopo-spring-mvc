package kr.ac.kopo.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//@RequestMapping("/method/method.do")
@Controller
public class MethodController {

//	@RequestMapping(value = "/method/method.do", method = RequestMethod.GET)
	@GetMapping("/method/method.do")
	public String get() {
		return "method/methodForm";
	}

//	@RequestMapping(value = "/method/method.do", method = RequestMethod.POST)
	@PostMapping("/method/method.do")
	public String post() {
		return "method/methodForm";
	}
	
	@PostMapping("method/methodProcess.do")
	public String methodProcess() {
		return "method/methodProcess";
	}
}
