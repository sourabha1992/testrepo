package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Topic;
import com.example.demo.repository.TopicRepository;

@Service
public class TopicsService {

	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getTopicList() {
		
		List<Topic> topics= (List<Topic>) topicRepository.findAll();
		return topics;
	}
	
	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	public Topic findTopicByID(int id) {
		return topicRepository.findById(id).get();
	}

	public Topic findTopicByName(String name) {
		return null;// topicRepository.findByName(name);
	}
}
