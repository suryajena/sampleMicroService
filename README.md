# sampleMicroService

This is a sample micro service application which is used along with discoveryService for discovery through eureka server.

Please note you have to download  "discoveryService" and run it before you run this micro service 

1> Download discoveryService and run it

2> Download this micro service repo and run it

3> Testing

 	a> One rest service is created , so if you go to browser "http://localhost:8800/users/surya" , you should see following line.
  
  	Hello surya, Welcome to Java world.
  
  	b> swagger is integrated in this applicaiton. Thus you can see all end points with following url
  
  	http://localhost:8800/swagger-ui.html
  
  	c> Now you can see this micro service registered in eureka server wchich we ran in first step. We can monitor this micro service with following url.
  
  	http://localhost:8761/

 
