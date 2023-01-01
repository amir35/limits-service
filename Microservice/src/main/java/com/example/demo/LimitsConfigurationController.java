package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
import com.example.demo.beans.LimitConfiguration;  
/*
 * @RestController public class LimitsConfigurationController {
 * 
 * @GetMapping("/limits") public LimitConfiguration
 * retriveLimitsFromConfigurations() { return new LimitConfiguration(1000, 1); }
 * }
 */

@RestController  
public class LimitsConfigurationController {
@Autowired    
private Configuration configuration;      
@GetMapping("/limits")  
public LimitConfiguration retriveLimitsFromConfigurations()  
{  
//getting values from the properties file
return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());  
}  
}  