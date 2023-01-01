package com.example.demo;
  
import org.springframework.boot.context.properties.ConfigurationProperties;  
import org.springframework.stereotype.Component;  

//@SuppressWarnings(value = { " " })
@Component  
//@ConfigurationProperties("microservice")
@ConfigurationProperties
public class Configuration   
{  
private int maximum;  
private int minimum;  

public void setMaximum(int maximum)   
{  
this.maximum = maximum;  
}  
public void setMinimum(int minimum)   
{  
this.minimum = minimum;  
}  
public int getMaximum()   
{  
return maximum;  
}  
public int getMinimum()   
{  
return minimum;  
}  
}  