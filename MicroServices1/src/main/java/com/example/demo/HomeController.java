package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class HomeController {
	@Autowired

	private RestTemplate rsTemplate;
	@GetMapping("/home")
	public String homecntrl()
	{
		String pString=rsTemplate.getForObject("http://localhost:8081/product", String.class);
		return pString;
	}
	}

