package com.project.web.proxies;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.web.tx.TxMapper;

@Component("manager") // manager란 이름으로 객체가 정해짐
public class UserProxy extends Proxy{
	@Autowired TxMapper txMapper;
	
	public String makeBirthday() {
		// 가우스 정규분포도에 따른 작업 진행
		// 1970~2010
		String birthday = "";
		return birthday;
	}
	
	public String makeGender() {
		List<String> genderText = Arrays.asList("M","F"); // 배열을 리스트로 바꾸는 함수
		Collections.shuffle(genderText);
		return genderText.get(0);
		// 1만명을 만든다. 만바퀴를 돌면, 알아서 셔플해서 줌 
	}
	
	public String makeUserid() {
		List<String> useridText = Arrays.asList("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z");
		Collections.shuffle(useridText);  // 알파벳 순서를 뒤섞어서 만듬
		return useridText.get(0);
	}
	public String makeName() {
		List<String> nameText = Arrays.asList("가","나","다","라","마","바","사","아");
		Collections.shuffle(nameText);
		return nameText.get(0);
	}
	public String makeTelephone() {
		List<String> telephoneText = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
		Collections.shuffle(telephoneText);
		return  telephoneText.get(0);
	}

}
