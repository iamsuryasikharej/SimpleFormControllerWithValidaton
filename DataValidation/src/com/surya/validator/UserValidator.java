package com.surya.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.surya.model.User;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return User.class.isAssignableFrom(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		User user=(User)arg0;
		ValidationUtils.rejectIfEmpty(arg1, "uname", "uname.required");
		ValidationUtils.rejectIfEmpty(arg1, "id", "id.required");
	}

}
