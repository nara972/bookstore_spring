package com.nara.bookstore.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nara.bookstore.mapper.AuthorMapper;
import com.nara.bookstore.model.AuthorVO;
import com.nara.bookstore.model.Criteria;

@Service
public class AuthorServiceImpl implements AuthorService{
	
	private static final Logger log = LoggerFactory.getLogger(AuthorServiceImpl.class);
	
	@Autowired
	AuthorMapper authorMapper;

	@Override
	public void authorEnroll(AuthorVO author) throws Exception {
		authorMapper.authorEnroll(author);
	}

	@Override
	public List<AuthorVO> authorGetList(Criteria cri) throws Exception {
		log.info("(service)authorGetList()......"+cri);
		
		return authorMapper.authorGetList(cri);
	}

	@Override
	public int authorGetTotal(Criteria cri) throws Exception {
        log.info("(service)authorGetTotal()......"+cri);
		
		return authorMapper.authorGetTotal(cri);
	}

}
