package io.javabrains.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


/*    <Entity, Id>   */

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);

}