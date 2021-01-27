package com.ashokit.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {


	public UserDaoImpl() {
		
		System.out.println("===== UserDaoImpl Constructor ========");
	}
	public String findNameById(Integer id) {
		
		if(id==101) {
			
		return "Jhon";
		
		}else if(id==102) 
		{
			
		return "sanil";	
		
		}
		
		return null;
	}

}
