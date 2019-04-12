package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;

	/*@Entity annotation tells JPA to create a table*/
@Entity
public class Course {
	
	/*@Id indicates the primary key of the table*/
@Id	
private String id;
private String name;
private String description;

/* In order to establish many to one relationship we use annotation @ManyToOne */
@ManyToOne
private Topic topic;

public Course() {
}

public Course(String id, String name, String description, String topicId) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.topic=new Topic(topicId,"","");
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public Topic getTopic() {
	return topic;
}

public void setTopic(Topic topic) {
	this.topic = topic;

	
}
}
