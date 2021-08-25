package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.DAO.TechDAO;
import com.example.demo.model.Tech;

@Controller
public class TechController
{
	@Autowired
	TechDAO techdao;
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}

	@RequestMapping("/addTech")
	public String addTech(Tech tech )
	{
		System.out.println("data " + tech);
		techdao.save(tech);
		return "home.jsp";
	}
	
	@RequestMapping("/getTech")
	public ModelAndView addTech(@RequestParam int id )
	{
		System.out.println("id get " + id);
		ModelAndView mv = new ModelAndView("get.jsp");
		Tech tech = techdao.findById(id).orElse(new Tech());
		mv.addObject(tech);
		
		System.out.println("eeeeee  ::: " + techdao.findBySub("spring"));
		System.out.println("ffffff  ::: " + techdao.findByIdGreaterThan(103));
		System.out.println("gggggg  ::: " + techdao.findBySubSorted("java"));
		
 		return mv;
	}
	
	@RequestMapping("/deleteTech")
	public ModelAndView deleteTech(@RequestParam int id )
	{
		System.out.println("id delete " + id);
		techdao.deleteById(id);
		ModelAndView mv = new ModelAndView("delete.jsp");
		return mv;

	}
	
	@RequestMapping("/deleteallTech")
	public ModelAndView deleteallTech( )
	{
		System.out.println("deleteallTech");
		techdao.deleteAll();
		ModelAndView mv = new ModelAndView("delete.jsp");
		return mv;

	}
	
	
	
	
}
