package com.project.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.project.web.domains.MemberDTO;

@Repository
public interface TxMapper {
	@Insert("insert into members (userid, password) "
			+ "values #{userid}, #{password}") // 이러한 방식으로 쿼리문을 넣을 수 있다.
	public void insertMember(MemberDTO member); // 1번의 서비스 호출로 다수의 인원을 넣기 위한 방법
	
	// 이곳에서 SQL문을 처리하라. 속도 관리
}
