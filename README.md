#How to create Spring Boot CRUD application using MVC with REST, JPA, Hibernate + MySQL

STEP 1: Setup Project

Go to https://start.spring.io/
Type Group Name, Artifacts and dependencies like below screen.
Click on generate project
Save project in your workspace

STEP2: Setup MySQL

STEP 3: Setup Project Structure.

Crete Packages controller, entity, model, repository, service(see project structure)

STEP 4: Create Entity

mark notation @Entity
mark notation @Table //if you need to explicitly define table name then use @Table(name = "user")

STEP 5: Create repository

STEP 6: Create Service and its implementaion

Create UserServiceImpl and implement UserService interface.
Mark notation @Service with name = “userService”.

STEP 7: Create controlle
create all required end points. and mark it with @RestController
