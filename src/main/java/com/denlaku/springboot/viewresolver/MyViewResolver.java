package com.denlaku.springboot.viewresolver;

import java.util.Locale;

import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

public class MyViewResolver implements ViewResolver {

	@Override
	public View resolveViewName(String viewName, Locale locale) throws Exception {
		return null;
	}

}
