#  Spring Boot With MDC

https://www.youtube.com/watch?v=CQpH4NNx8P0


To build a Java project that uses Maven
```
mvn clean install
```


Run the project
```
mvn spring-boot:run
```

```

2025-09-03 22:33:58 [] - Tomcat initialized with port(s): 8080 (http)
2025-09-03 22:33:58 [] - Starting service [Tomcat]
2025-09-03 22:33:58 [] - Starting Servlet engine: [Apache Tomcat/9.0.46]
2025-09-03 22:33:58 [] - Initializing Spring embedded WebApplicationContext
2025-09-03 22:33:58 [] - Root WebApplicationContext: initialization completed in 500 ms
2025-09-03 22:33:58 [] - Filter uniqueIdFilter was not registered (possibly already registered?)
2025-09-03 22:33:58 [] - Tomcat started on port(s): 8080 (http) with context path ''
2025-09-03 22:33:58 [] - Started SpringBootMdcDemoApplication in 0.958 seconds (JVM running for 1.138)

```


Go to Postman

GET http://localhost:8080/employees

![alt text](<Screenshot 2025-09-03 at 10.43.45 PM.png>)

```
2025-09-03 22:41:36 [] - Tomcat initialized with port(s): 8080 (http)
2025-09-03 22:41:36 [] - Starting service [Tomcat]
2025-09-03 22:41:36 [] - Starting Servlet engine: [Apache Tomcat/9.0.46]
2025-09-03 22:41:36 [] - Initializing Spring embedded WebApplicationContext
2025-09-03 22:41:36 [] - Root WebApplicationContext: initialization completed in 709 ms
2025-09-03 22:41:36 [] - Filter uniqueIdFilter was not registered (possibly already registered?)
2025-09-03 22:41:37 [] - Tomcat started on port(s): 8080 (http) with context path ''
2025-09-03 22:41:37 [] - Started SpringBootMdcDemoApplication in 1.257 seconds (JVM running for 1.453)
2025-09-03 22:41:37 [] - Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-09-03 22:41:37 [] - Initializing Servlet 'dispatcherServlet'
2025-09-03 22:41:37 [] - Completed initialization in 0 ms
2025-09-03 22:41:37 [uuid-99090rr] - Inside getAllEmpployee method of EmployeeController
2025-09-03 22:41:37 [uuid-99090rr] - Inside getAllEmpployee method of EmployeeServiceImpl
2025-09-03 22:41:37 [uuid-99090rr] - list of employees : [Employee(id=1, name=karan, salary=5000), Employee(id=2, name=Vivek, salary=7000), Employee(id=3, name=Mohit, salary=9000)] 
```

