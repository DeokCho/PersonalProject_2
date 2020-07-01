package com.project.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.project.web.domains.MemberDTO;
import com.project.web.enums.Messenger;
import com.project.web.services.MemberService;

@RequestMapping("/member")
@RestController
public class MemberController {
	@Autowired MemberService memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@PostMapping("/members")
	public Messenger join(@RequestBody MemberDTO member) {
		System.out.println("넘어온 회원정보"+member.toString());
		return Messenger.SUCCESS;
	}

	
}

