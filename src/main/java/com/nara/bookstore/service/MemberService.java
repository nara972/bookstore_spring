package com.nara.bookstore.service;

import com.nara.bookstore.model.MemberVO;

public interface MemberService {
	
	//회원가입
	public void memberJoin(MemberVO member) throws Exception;

}
