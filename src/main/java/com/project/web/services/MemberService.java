package com.project.web.services;

import org.springframework.stereotype.Component;

import com.project.web.domains.MemberDTO;

@Component
public interface MemberService {
	public MemberDTO findPersonForAccess(MemberDTO member);
	
}

//package com.project.web.services;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public interface BasellballService {
//
//}
