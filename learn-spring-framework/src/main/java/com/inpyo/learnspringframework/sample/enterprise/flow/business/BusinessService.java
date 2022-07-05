
package com.inpyo.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inpyo.learnspringframework.sample.enterprise.flow.data.DataService;

@Component
public class BusinessService {
	// Business 로직 표현되는 곳
	@Autowired
	private DataService dataService;
	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();
		return data.stream().reduce(Integer::sum).get();
}
}