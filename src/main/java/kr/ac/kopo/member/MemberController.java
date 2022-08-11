package kr.ac.kopo.member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

	@RequestMapping(value = "/form/joinForm.do")
	public String joinForm() {
		return "form/joinForm";

	}
	
	@RequestMapping("/join.do")
	public String join5(MemberVO member) {
		
//		return "form/memberInfo";
		
//		localhost:9990/kopo-pring-mvc
		return "redirect:/hello/hello.do";
	}

//	@RequestMapping("/join.do")
	public ModelAndView join4(MemberVO member) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("form/memberInfo");
		mav.addObject("member", member);
		
		return mav;
		
	}

//	@RequestMapping("/join.do")
	public String join3(@ModelAttribute("member") MemberVO member) {

		// @ModelAttribute("member") 가 없으면 자동으로 memberVO로 등록시킴

		return "form/memberInfo";
	}

//	@RequestMapping("/join.do")
	public String join2(HttpServletRequest request, @RequestParam("id") String id,
			@RequestParam("password") String password, @RequestParam("name") String name) {

		MemberVO member = new MemberVO(id, password, name);

		request.setAttribute("member", member);

		return "form/memberInfo";
	}

	// @RequestMapping("/join.do")
	public String join(HttpServletRequest request) {

		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		MemberVO member = new MemberVO(id, password, name);

		request.setAttribute("member", member);

//		request.setAttribute("id", id);
//		request.setAttribute("password", password);
//		request.setAttribute("name", name);

		return "form/memberInfo";
	}

}
