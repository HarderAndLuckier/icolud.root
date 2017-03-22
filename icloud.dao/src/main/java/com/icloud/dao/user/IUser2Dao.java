package com.icloud.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icloud.model.user.User;

public interface IUser2Dao {
	void addUser(User user);
/*	public void delUser(User user);
	public User modfiyUser(User user);
	public List getUserList();*/
}
