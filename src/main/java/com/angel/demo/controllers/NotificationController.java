package com.angel.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.angel.demo.rest.dto.Notification;
import com.angel.demo.rest.repositoryes.NotificationRepository;


@RestController()
@RequestMapping("/notification")
public class NotificationController {

	NotificationRepository nrepo = new NotificationRepository();
	
	@RequestMapping(
			value = "/all",
			produces = "application/json",
			method = {RequestMethod.GET, RequestMethod.PUT})
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
	
	@PutMapping("/nameUpdate")
	public Notification updateNotificationName(@RequestParam(value="oldName") 
					String oldName, @RequestParam(value="newName") String newName) {
		nrepo.updateNotificationName(oldName, newName);
		return nrepo.notificationByName(newName);
	}
	
	@PutMapping("/textUpdate")
	public Notification updateNotificationText(@RequestParam(value="oldText") 
					String oldText, @RequestParam(value="newText") String newText) {
		nrepo.updateNotificationText(oldText, newText);
		return nrepo.notificationByText(newText);
	}
	
	@DeleteMapping("/delete")
	public void deleteNotification(@RequestParam(value="id") Long id) {
		nrepo.deleteNotification(id);
	}
	
}
