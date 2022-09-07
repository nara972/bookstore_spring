package com.nara.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nara.bookstore.mapper.AdminMapper;
import com.nara.bookstore.model.BookVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminMapper adminMapper;
	
	public void bookEnroll(BookVO book) {
		
		log.info("(service)bookEnroll.........");
		
		adminMapper.bookEnroll(book);
		
	}

}
