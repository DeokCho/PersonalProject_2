package com.project.web.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.project.web.domains.MemberDTO;
import com.project.web.enums.Messenger;
import com.project.web.services.MemberService;

@RequestMapping("/member")
@RestController
@SessionAttributes({"session"})
public class MemberController {
	@Autowired MemberService memberService;
	@Autowired MemberDTO memberDTO;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@PostMapping("/members")
	public Messenger join(@RequestBody MemberDTO member) {
		memberDTO.setUserid(member.getUserid());
		memberDTO.setPassword(member.getPassword());
		System.out.println("회원가입 성공");
		return Messenger.SUCCESS;
	}

	/*@PostMapping("/members/{userid}")
	public Messenger login(@PathVariable String userid) {
		System.out.println("넘어온 회원정보 : "+userid);
		return Messenger.SUCCESS;
	}*/

	@PostMapping("/login/{userid}")
	public MemberDTO login(@PathVariable String userid, HttpSession session, @RequestBody MemberDTO member) {
		System.out.println("멤버컨트롤러");
		MemberDTO returnMember = memberService.findByUseridAndPassword(member);
		session.setAttribute("Session", returnMember);
		System.out.println("로그인 정보:"+session.getAttribute("session"));
		return returnMember;
	}
}

