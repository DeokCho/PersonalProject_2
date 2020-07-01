package com.project.web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.web.domains.MemberDTO;
import com.project.web.mappers.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired MemberMapper memberMapper;

	@Override
	public MemberDTO findPersonForAccess(MemberDTO member) {
		return memberMapper.selectOneFromMembers(member);
	}
	
	
}


//package com.project.web.services;
//
//import org.springframework.stereotype.Service;
//
//@Service
//public class BasellballServiceImpl {
//
//}

