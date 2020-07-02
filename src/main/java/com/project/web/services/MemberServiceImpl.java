package com.project.web.services;

import java.util.Date;

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
	@Autowired MemberDTO member;

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public MemberDTO findByUseridAndPassword(MemberDTO member) {
		return memberMapper.selectByUseridAndPassword(member);
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

