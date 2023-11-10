package com.TestCentre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.TestCentre.service.MyTestService;

@Controller
public class MyTestController
{
	@Autowired
	private MyTestService myService;
	
	@RequestMapping("/deleteMyList/{id}")
	public String deleteMyList(@PathVariable("id") int id)
	{
		myService.deleteById(id);
	  return "redirect:/my_tests";
	}
	
	
}
