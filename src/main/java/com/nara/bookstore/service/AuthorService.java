package com.nara.bookstore.service;

import com.nara.bookstore.model.AuthorVO;

public interface AuthorService {
	
	/* 작가 등록 */
	public void authorEnroll(AuthorVO author) throws Exception;

}
