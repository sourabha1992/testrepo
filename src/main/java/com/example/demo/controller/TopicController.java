package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Topic;
import com.example.demo.service.TopicsService;

@RestController
public class TopicController {
    @Autowired
	TopicsService topicService;
	
	@RequestMapping(path = "/topicsList",method = RequestMethod.GET)
	public List<Topic> getAllTopics(){
		return topicService.getTopicList();
	}
	@RequestMapping(path = "/addTopic",method = RequestMethod.POST)
	public Topic addTopic(@RequestBody Topic topic) {
		return topicService.addTopic(topic);
	}
	@RequestMapping(path = "/findTopicById/{id}",method = RequestMethod.GET)
	public Topic findTopic(@PathVariable int id) {
		return topicService.findTopicByID(id);
	}
	@RequestMapping(path = "/findTopicByName/{name}",method = RequestMethod.GET)
	public Topic findTopic(@PathVariable String name) {
		return topicService.findTopicByName(name);
	}
}
