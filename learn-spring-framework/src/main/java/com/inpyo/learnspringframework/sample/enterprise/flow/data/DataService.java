package com.inpyo.learnspringframework.sample.enterprise.flow.data;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	// DataBase에서 데이터 가져오는 것과 관련
	public List<Integer> retrieveData(){
		return List.of(11, 13, 15);
	}
}
