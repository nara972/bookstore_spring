package com.nara.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nara.bookstore.mapper.MemberMapper;
import com.nara.bookstore.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberMapper membermapper;

	@Override
	public void memberJoin(MemberVO member) throws Exception {
		membermapper.memberJoin(member);
	}

}
