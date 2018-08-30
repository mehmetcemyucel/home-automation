package com.cem;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IrrigationService {

	// @Autowired
	// private DataSource dataSource;

	@RequestMapping(value = "/db", method = RequestMethod.GET)
	String helloWorld(@RequestParam(value = "name", defaultValue = "World") String name) {
		return "Hello " + name;
	}

}
