https://www.baeldung.com/spring-inject-bean-into-unmanaged-objects

Idea:
use @Configurable Spring annotation for autowiring services into non-managed spring beans

Steps:

1. Add @Configurable annotation to a non-spring bean class
2. Set autowire = Autowire.BY_TYPE in @Configurable params
3. Set preConstruction = true in @Configurable params
4. Add spring-aspects maven dependency
5. Add aspectj-maven-plugin into maven plugins section (this example somehow works with 1.14.0 version, but not lower)
6. Set up aspectj-maven-plugin configuration (see pom.xml)
7. Add @EnableSpringConfigured annotation (to @Configuration class or main class)

ATTENTION: be careful with Lombok! Might be an issues during compilation