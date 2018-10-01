package com.yo1000.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import com.yo1000.repository.DateTimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	private DateTimeRepository dateTimeRepository;

	@Autowired
	public DemoController(DateTimeRepository dateTimeRepository) {
		this.dateTimeRepository = dateTimeRepository;
	}

	@RequestMapping(value="/")
	public ModelAndView index(HttpServletResponse response) throws IOException{
		ModelAndView modelAndView = new ModelAndView("index");

		modelAndView.addObject("now", dateTimeRepository.now().toString());
		modelAndView.addObject("today", dateTimeRepository.today().toString());

		return modelAndView;
	}
}
