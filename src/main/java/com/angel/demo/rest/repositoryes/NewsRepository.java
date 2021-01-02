package com.angel.demo.rest.repositoryes;

import java.util.Date;
import java.util.Hashtable;
import java.util.Map;

import com.angel.demo.rest.dto.News;

public class NewsRepository {
static Map<String, News> news = new Hashtable<>();
	
	static {
		news.put("10 лет ПСО Ангел", new News(1L, "10 лет ПСО Ангел",
				"10 лет ПСО отметили в собственной базе на основе штаба МЧС!",
				new Date()));
		news.put("7 лет ПСО Ангел", new News(1L, "7 лет ПСО Ангел",
				"7 лет ПСО отметили в составе 170 волонтёров!",
				new Date()));
		news.put("8 лет ПСО Ангел", new News(1L, "8 лет ПСО Ангел",
				"8 лет ПСО отметили с новыми 26 координаторами лесного поиска!",
				new Date()));
	}
	
	public News newsByName(String name) {
		return news.get(name);
	}
	
	public News addNews(News n) {
		news.put(n.getName(), n);
		return n;
	}
	
}
