# Spring Boot

AOP Aspect Oriented Programming
IoC (Inversion of Control)
Constructor Injection

# Inversion of Control

# SpEL
Spring Expression Language

# Annotations

## @Component
Class-level annotation, makes the class a Spring Bean, adds it to the bean registry, makes it available to be injected.

## @Controller: handles requests and emits responses
## @Repository: handles CRUD for accessing and persisting data
## @Service: handles business logic
Class-level annotation, makes the class a Spring Bean. Used instead of `@Component`, these stereotype annotations clarify intent.
`@Controller` is for web controller classes that receive and emit HTTP requests/responses (eg for the Spring MVC framework)

## @RestController
Class-level. Declares a controller that handles http requests and returns JSON or XML rather than a view template.

## @RequestMapping and @GetMapping/@PostMapping...
Class-level or method-level. Used on controllers. When class-level, all method-level mappings will be mapped to that url and can then build on it. Eg `@GetMapping` to handle GET requests.
```java
@RequestMapping("/orders")
public class OrderController {
	@GetMapping("/{id}")
	public ResponseEntity<?> getOrder(@PathVariable String id){
		return new ResponseEntity<>(new Order(id), HttpStatus.OK);
	}
}
```
Map HTTP requests. 

## @PathVariable
Used to grab variables from the path and pass them as params to the method.

## @AutoWired
Annotate a field, constructor or setter
Prefer constructor injection.
Activates dependency injection. Will inject the appropriate bean as long as there only one bean of that type.
(otherwise needs to be indicated)

## @Value
Annotate a field or setter (constructor?)
For injecting values, including from property file.
Good to avoid hard-coded values.
Can be used with Spring Expression Language.
```java
@Value("my hard-coded value")
String hardCodedValue;

@Value("${database.url}")
String databaseUrl;

// or using SpEL:
@Value("#{systemProperties['user.name']}")
String userName;
```

## @Configuration
Marks a class that's for configuring the framework.
Contains setup and wiring logic as opposed to business logic.
Can be used with `@ComponentScan("com.packagename")`.

## @SpringBootApplication
Enables auto-configuration and component scanning. Combines multiple annotations: `@Configuration`, `@EnableAutoConfiguration` and `@ComponentScan`
On main class

## @ComponentScan
```java
@Configuration
@ComponentScan("com.package.to.scan")
public class MyConfig {...}
```

## @Bean
Method-level
Annotate a method and tells Spring that the return of this method should be a bean and makes it available for injection.

## @Transactional
Method-level. Spring will handle the transaction (eg preparation, eventual rollback in case of issue, commit at the end of the transaction)



# Proxies

# Spring Data
## Repository interface
leverages proxies to carry out the CRUD methods
## Entity object
DTO for the data layer, use JPA and maps it to the underlying data source
Can do joins through entities
## DataSource
mostly not accessed directly


