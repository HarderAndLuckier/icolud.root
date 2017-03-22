package com.icloud.dao.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.icloud.model.user.UserVO;

public interface IUserDao {
	void addUser(@Param("user")UserVO user);
	public List getUserList();
}
