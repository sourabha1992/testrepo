package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Integer>{

	//public Topic findByName(String topicName);
}
