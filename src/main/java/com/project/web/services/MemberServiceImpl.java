package com.project.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.web.controllers.MemberController;
import com.project.web.domains.MemberDTO;
import com.project.web.mappers.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	private static final Logger logger = LoggerFactory.getLogger(MemberServiceImpl.class);
	
	@Autowired MemberMapper memberMapper;

	@Override
	public MemberDTO findPersonForAccess(MemberDTO member) {
		logger.info(member.toString());
		return null;
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

