package com.nara.bookstore.service;

import java.util.List;

import com.nara.bookstore.model.AuthorVO;
import com.nara.bookstore.model.Criteria;

public interface AuthorService {
	
	/* 작가 등록 */
	public void authorEnroll(AuthorVO author) throws Exception;
	
	/* 작가 목록 */
	public List<AuthorVO> authorGetList(Criteria cri) throws Exception;

}
