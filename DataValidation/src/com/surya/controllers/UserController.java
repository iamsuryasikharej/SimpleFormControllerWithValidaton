package com.surya.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.validation.BindException;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.surya.model.User;


public class UserController extends SimpleFormController {
@Override
protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
		BindException errors) throws Exception {
	// TODO Auto-generated method stub
	User user=(User)command;

	System.out.println(user.getUname()); 
	return new ModelAndView("userdetails","user",user);
}
}
