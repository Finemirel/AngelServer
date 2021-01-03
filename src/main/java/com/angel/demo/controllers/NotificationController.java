package com.angel.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angel.demo.rest.dto.Notification;
import com.angel.demo.rest.repositoryes.NotificationRepository;


@RestController()
@RequestMapping("/notification")
public class NotificationController {

	NotificationRepository nrepo = new NotificationRepository();
	
	@GetMapping("/all")
	public List<Notification> notificationAll() {
		return nrepo.notificationAll();
	}
	
	@GetMapping("/byName")
	public Notification notificationByName(@RequestParam(value="name") String name) {
		return nrepo.notificationByName(name);
	}
	
	@GetMapping("/byId")
	public Notification notificationById(@RequestParam(value="id") Long id) {
		return nrepo.notificationById(id);
	}
	
	@PostMapping
	public Notification createNotification(@RequestParam(value="name") 
					String name, @RequestParam(value="text") String text) {
		return nrepo.addNotification(name, text);
	}
	
	@PutMapping("/name/{id}")
	public Notification updateNotificationName(@RequestParam(value="oldName") 
					String oldName, @RequestParam(value="newName") String newName) {
		return nrepo.updateNotificationName(oldName, newName);
	}
	
	@PutMapping("/text/{id}")
	public Notification updateNotificationText(@RequestParam(value="oldText") 
					String oldText, @RequestParam(value="newText") String newText) {
		return nrepo.updateNotificationText(oldText, newText);
	}
	
	@DeleteMapping("{id}")
	public void deleteNotification(@RequestParam(value="id") Long id) {
		nrepo.deleteNotification(id);
	}
	
}
