package kr.ac.kopo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/hello/hello.do") //라는 요청이 들어오면 hello()라는 메소드를 실행시켜라
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello/hello"); //hello 폴더 밑에 있는 hello.jsp를 출력시켜줘
		mav.addObject("msg","hello spring mvc");
		
		return mav;
		
		//1. modelandview
		//2. string(jsp 주소)
		//3. void
		//4. json string(jsp 주소가 아닌것)
		
	}
}
