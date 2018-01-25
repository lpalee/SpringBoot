package com.example.demo.chapter1.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test/{id}")
public class PathVariableTest {

	@GetMapping("/{name}/index.do")
	public String get (@PathVariable Integer id, @PathVariable String name) {
		return id + "_" + name;
	}
	
	@RequestMapping("/{name}/get.do")
	public String get (@PathVariable("id") Integer index, Model model) {
		model.addAttribute("id", index);
		return "/index";
	}
	
	@RequestMapping("/{name}/get2.do")
	public ModelAndView get (@PathVariable("name") Integer index, ModelAndView view) {
		view.addObject("id", index);
		view.setViewName("/index.ftl");
		return view;
	}
	
	@RequestMapping("/{name}/get3.do")
	public ModelAndView get (@PathVariable("name") Integer index) {
		ModelAndView view = new ModelAndView();
		view.addObject("id", index);
		view.setViewName("/index.ftl");
		return view;
	}
}
