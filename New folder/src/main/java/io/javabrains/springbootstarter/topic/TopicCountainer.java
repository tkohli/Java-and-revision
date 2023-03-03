package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicCountainer {
		
	@RequestMapping("/topic")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
					new Topic("spring","Spring Framework","A course on Spring"),
					new Topic("C","C Framework","A course on C"),
					new Topic("C++","C++ Framework","A course on C++")

				);
	}
}




