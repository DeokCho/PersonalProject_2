package com.project.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.project.web.domains.MemberDTO;

@Component
public interface MemberService {
	 public void save();
	 public void update();
	 public void findOne();
	 public List<MemberDTO> findAll();		
	 public void count();
	 public void delete();
	 public MemberDTO findByUseridAndPassword(MemberDTO member);
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
