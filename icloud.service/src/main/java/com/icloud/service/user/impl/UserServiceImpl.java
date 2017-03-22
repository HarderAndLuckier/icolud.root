package com.icloud.service.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icloud.dao.user.IUser2Dao;
import com.icloud.model.user.User;
import com.icloud.service.user.IUserService;
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUser2Dao userDao;
    
	public void addUser(User user) throws Exception {
		userDao.addUser(user);
	}

//	 public List getUserList() throws Exception{
//		 List userList = null;
//		 
//		 userList = userDao.getUserList();
//		 
//		 if(userList == null || userList.size() < 1){
//			 userList = new ArrayList();
//		 }
//		 
//		 return userList;
//	 }
}
