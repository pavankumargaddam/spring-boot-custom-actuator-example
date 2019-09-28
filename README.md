#Spring Boot Actuator Example

If you add a @Bean annotated with @Endpoint, any methods annotated with @ReadOperation, @WriteOperation, or @DeleteOperation are automatically exposed over JMX and, in a web application, over HTTP as well. Endpoints can be exposed over HTTP using Jersey, Spring MVC, or Spring WebFlux.

You can also write technology-specific endpoints by using @JmxEndpoint (exposed only over JMX and not over HTTP) or @WebEndpoint (exposed only over HTTP and not over JMX).

You can write technology-specific extensions by using @EndpointWebExtension and @EndpointJmxExtension. These annotations let you provide technology-specific operations to augment an existing endpoint.

Finally, if you need access to web-framework-specific functionality, you can implement Servlet or Spring @Controller and @RestController endpoints at the cost of them not being available over JMX or when using a different web framework.

 In this Project we will see on @Endpoint, @ControllerEndpoint and @RestControllerEndpoint.

#@Endpoint

Create below class, which is annotated with @Endpoint and it means that we are creating custom endpoint using Spring Boot Actuator.

The class must have @Component annotation in order to let container pick up the class.

You must provide a unique id to the endpoint in order to identify it.

We have shown here @ReadOperation, which is equivalent to HTTP GET request. You can also create other operations, such as, @WriteOperation (POST), @DeleteOperation (DELETE).

#@ControllerEndpoint and @RestControllerEndpoint

@ControllerEndpoint and @RestControllerEndpoint can be used to implement an endpoint that is only exposed by Spring MVC or Spring WebFlux.
Methods are mapped using the standard annotations for Spring MVC and Spring WebFlux such as @RequestMapping and @GetMapping, with the endpoint’s ID being used as a prefix for the path. Controller endpoints provide deeper integration with Spring’s web frameworks but at the expense of portability.
The @Endpoint and @WebEndpoint annotations should be preferred whenever possible.


#Add the below properties for enabling actuator end points

#Enable all the actuator endpoints
management.endpoints.web.exposure.include=*

#Enable only created custom actuator
management.endpoints.web.exposure.include=student-endpoint,controller-endpoint,rest-controller-endpoint

#Custom Actuator End Points in this project

http://localhost:2500/actuator/student-endpoint?name=kumar
http://localhost:2500/actuator/student-controller-endpoint/student?name=kumar
http://localhost:2500/actuator/student-rest-controller-endpoint/student?name=kumar

#The below base Actuator End Point will list all default actuator end points
http://localhost:2500/actuator/




