package com.douzone.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.mysite.repository.GuestbookRepository;
import com.douzone.mysite.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookRepository guestbookRepository;

	public List<GuestbookVo> getMessageList() {
		return guestbookRepository.findAll();
	}

	public Boolean deleteMessage(Long no, String password) {
		return guestbookRepository.delete(no, password);
	}

	public Boolean addMessage(GuestbookVo vo) {
		return guestbookRepository.insert(vo);
	}
}