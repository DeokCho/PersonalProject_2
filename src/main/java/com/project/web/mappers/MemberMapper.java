package com.project.web.mappers;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.project.web.domains.MemberDTO;

@Repository
public interface MemberMapper {
	public void insertUser(MemberDTO user);
	public MemberDTO selectUserByIdPw(MemberDTO user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateMember(HashMap<String, String> paramMap);
	public MemberDTO selectByUseridAndPassword(MemberDTO member);
}