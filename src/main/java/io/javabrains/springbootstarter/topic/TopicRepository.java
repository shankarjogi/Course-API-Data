package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;


/*    <Entity, Id>   */

public interface TopicRepository extends CrudRepository<Topic, String>{

/*	getAllTopics()
	getTopic(String id)
	updateTopic(Topic t)
	deleteTopic(String id)
*/
}