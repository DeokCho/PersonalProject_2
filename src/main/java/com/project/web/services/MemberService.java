package com.project.web.services;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.project.web.domains.MemberDTO;

@Component
public interface MemberService {
	 public void save();
	 public void update();
	 public void findOne();
	 public void findAll();	
	 public void count();
	 public void delete();
	 public void findByEmailAndUserId(String email, String userId);
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
}

//package com.project.web.services;
//
//import org.springframework.stereotype.Component;
//
//@Component
//public interface BasellballService {
//
//}
