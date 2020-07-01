package com.project.web.mappers;

import org.springframework.stereotype.Repository;

import com.project.web.domains.MemberDTO;

@Repository
public interface MemberMapper {

	public void insertOneIntoMembers(MemberDTO member);
	public MemberDTO selectOneFromMembers(MemberDTO member);
	
	
}

//package com.project.web.mappers;
//
//import org.springframework.stereotype.Repository;
//
//import com.project.web.domains.BaseballDTO;
//
//@Repository
//public interface BasellballMapper {
//	public void insert(BaseballDTO baseball);
//	public BaseballDTO login(BaseballDTO baseball);
//	public void update(BaseballDTO baseball);
//	public void delete(BaseballDTO baseball);
//	public BaseballDTO selectOne(String referenceSeq);
//}
