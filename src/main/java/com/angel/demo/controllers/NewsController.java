package com.angel.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angel.demo.rest.dto.News;
import com.angel.demo.rest.repositoryes.NewsRepository;

@RestController
public class NewsController {

	NewsRepository nrepo = new NewsRepository();
	
	@GetMapping("/news")
	public News news(@RequestParam(value="name", required = true) String name) {
		return nrepo.newsByName(name);
	}
	
}
