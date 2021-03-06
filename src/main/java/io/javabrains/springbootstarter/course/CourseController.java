package io.javabrains.springbootstarter.course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import io.javabrains.springbootstarter.topic.Topic;

@RestController
@EnableAutoConfiguration
public class CourseController {
	@Autowired
	private CourseService courseService;

	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable String id) {
		return courseService.getAllCourses(id);

	}

	@RequestMapping("/topics/{id}/courses/{courseId}")
	public Course getCourse(@PathVariable String id) {
		return courseService.getCourse(id);

	}

	/* POST METHOD */
	@RequestMapping(method = RequestMethod.POST, value = "/topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId) {
		course.setTopic(new Topic(topicId, "", "")); 
		courseService.addCourse(course);

	}

	/* Update METHOD */
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{id}")
	public void updateTopic(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id) {
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);

	}

	/* Delete Method */
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicid}/course/{id}")
	public void deleteTopic(@PathVariable String id) {
		courseService.deleteCourse(id);

	}
}