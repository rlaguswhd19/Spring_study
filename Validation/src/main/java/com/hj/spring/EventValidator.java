package com.hj.spring;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Event.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "title", "notempty","Empty title is not allowed.");
	}

}
