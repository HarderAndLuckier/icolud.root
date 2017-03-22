package com.icloud.controller.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.icloud.model.user.User;
import com.icloud.model.user.UserVO;
import com.icloud.service.user.IUserService;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/login")
    public String login() {
/*        UserVO user = new UserVO();
        user.setUserId("1");
        user.setUserName("test1");
        user.setPassword("123456");*/
    	User user = new User();
    	user.setAddress("sd");
    	user.setBirthday(new Date());
    	user.setSex("0");
    	user.setUserNaem("zh");

        try {
            userService.addUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "user/login";
    }
    
/*	@RequestMapping("/list")
    public ModelAndView getUserRegisterList(HttpServletResponse response){
    	ModelAndView modelView = new ModelAndView();
    	List<UserVO> userList = new ArrayList();
    	
    	try {
    		userList = userService.getUserList();
    		System.out.println(userList.size());
			modelView.addObject("userList", userList);
			modelView.addObject("dddd", userList.size());
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	modelView.setViewName("user/list");
    	return modelView;
    }*/
}

