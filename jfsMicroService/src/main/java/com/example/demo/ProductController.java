package com.example.demo;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class ProductController {
		@GetMapping("/product")
		public String homecntrl()
		{
			return "Hello Welcome To Product Page";
		}
		@Bean
		@LoadBalanced
		public RestTemplate createresttemplate()
		{
			
		
			RestTemplate restTemplate=new RestTemplate();
			return restTemplate;
			
		}
		
	}


