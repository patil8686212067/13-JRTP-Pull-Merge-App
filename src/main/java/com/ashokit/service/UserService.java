package com.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.dao.ReportDao;
import com.ashokit.dao.UserDao;
@Service
public class UserService {
	@Autowired
	private UserDao userDao;//REFLECTION API
	
	public void printUserName(Integer id) {
		
		String userName = userDao.findNameById(id);
		System.out.println("======userName======"+userName);
		
	}
}
