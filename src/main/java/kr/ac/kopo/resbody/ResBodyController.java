package kr.ac.kopo.resbody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.ac.kopo.member.MemberVO;


//@Controller
@RestController
public class ResBodyController {

//	@ResponseBody
	@RequestMapping("/resBody.do")
	public String resStringBody() {
		
		return "OK, 성공!";
	}
	
//	@ResponseBody
	@RequestMapping("/resJsonBody.json")
	public Map<String, String> resJsonBody() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", "hong");
		map.put("name", "홍길동");
		map.put("password", "1111");
		
		return map;
	}
	
//	@ResponseBody
	@RequestMapping("/resVOBody.json")
	public MemberVO resJsonVOBoday() {
		MemberVO vo = new MemberVO("kdhong", "2222", "홍홍홍");
		return vo;
	}
	
//	@ResponseBody
	@RequestMapping("/resVOListBody.json")
	public List<MemberVO> resJsonVOListBoday() {
		List<MemberVO> memberList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			MemberVO vo = new MemberVO("kdhong", "2222", "홍홍홍");
			memberList.add(vo);
		}
		return memberList;
	}
}
