package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.AlienRepository;
import com.example.demo.model.Coche;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepository alienrepo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Coche alien) {
		alienrepo.save(alien);
		return "home.jsp";
	}
	
}
