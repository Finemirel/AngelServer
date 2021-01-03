package com.angel.demo.rest.repositoryes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.angel.demo.rest.dto.Notification;

public class NotificationRepository {
	
	private static Map<Long, Notification> notification = new Hashtable<>();
	
	static {
		notification.put(1L, new Notification("10 лет ПСО Ангел",
				"10 лет ПСО отметили в собственной базе на основе штаба МЧС!"));
		notification.put(2L, new Notification("7 лет ПСО Ангел",
				"7 лет ПСО отметили в составе 170 волонтёров!"));
		notification.put(3L, new Notification("8 лет ПСО Ангел",
				"8 лет ПСО отметили с новыми 26 координаторами лесного поиска!"));
	}
	
	private Iterator<Notification> iteratorNotifications() {
		Collection<Notification> values = notification.values();
		return values.iterator();
	}
	
	public List<Notification> notificationAll() {
		List<Notification> notifications = new ArrayList<>();
		Iterator<Notification> itr = this.iteratorNotifications();
		while(itr.hasNext()) {
			notifications.add(itr.next());
		}
		
		return notifications;
	}
	
	public Notification notificationById(Long id) {
		return notification.get(id);
	}
	
	public Notification addNotification(String name, String text) {
		Notification n = new Notification(name, text);
		notification.put(n.getId(), n);
		return n;
	}
	
	public Notification notificationByName(String name) {
		Iterator<Notification> itr = this.iteratorNotifications();
		while(itr.hasNext()) {
			Notification note = itr.next();
			if(note.getName().equals(name)) {
				return note;
			}
		}
		return null;
	}
	
	public Notification updateNotificationName(String oldName, String newName) {
		Iterator<Notification> itr = this.iteratorNotifications();
		Notification result = null;
		while(itr.hasNext()) {
			Notification note = itr.next();
			if(note.getName().equals(oldName)) {
				note.setName(newName);
				break;
			}
		}
		return result;
	}
	
	public Notification updateNotificationText(String oldText, String newText) {
		Iterator<Notification> itr = this.iteratorNotifications();
		Notification result = null;
		while(itr.hasNext()) {
			Notification note = itr.next();
			if(note.getText().equals(oldText)) {
				note.setText(newText);
				break;
			}
		}
		return result;
	}
	
	public void deleteNotification(Long id) {
		notification.remove(id);
	}
	
	
}
