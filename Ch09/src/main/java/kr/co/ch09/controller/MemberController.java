package kr.co.ch09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ch09.vo.MemberVO;

@RestController
public class MemberController {

	@GetMapping("/member")
	public void list() {
		
	}
	
	@GetMapping("/member/{uid}")
	public void list(@PathVariable("uid") String uid) {
		
	}
	
	
	@PostMapping("/member")
	public void register(MemberVO vo) {
		
	}
	
	@PutMapping("/member")
	public void modify(MemberVO vo) {
		
	}
	
	@DeleteMapping("/member/{uid}")
	public void delete(@PathVariable("uid") String uid) {
		
	}
}
