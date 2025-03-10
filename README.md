Cloned from [here](https://github.com/Genc/spring-boot-boilerplate)

# Spring Boot Boilerplate
 *Spring Boot Boilerplate* is a **starter kit**. This project is a very simple and useful.

### Run
To run the app, do.

```
mvn clean spring-boot:run
```

### Database
Using in memory database now instead of postgres, like in [here](https://github.com/spring-guides/tut-rest) .

### Curl requests

```
curl --request POST --data '{ "name": "Omer Faruk Gen", "email": "omer@farukgenc.com","username": "faruk", "password": "faruk" }' --header "Content-Type: application/json" http://localhost:8080/register

curl --request POST --data '{ "username": "faruk", "password": "faruk" }' --header "Content-Type: application/json" http://localhost:8080/login

curl --header "Content-Type: application/json" --header "Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJmYXJ1ayIsInJvbGUiOiJVU0VSIiwiaXNzIjoid3d3LmZhcnVrZ2VuYy5jb20iLCJleHAiOjE3MjEzNDcwNDUsImlhdCI6MTcyMTM0NjQ0NX0.f5r47Ic-dUSJwvGj3_tAAv760XRmTbRi3MiKeylYNLM" http://localhost:8080/hello
```

## Technologies
- Spring Boot (v2.7.10)
- Spring Data JPA
- Spring Validation
- Spring Security + JWT Token
- PostgreSQL
- Mapstruct
- Lombok
- Swagger (Open API)

## Customization

- You can customize ```token information (secret key, issuer, expiry date) ``` in [*application.yml*](https://github.com/Genc/spring-boot-boilerplate/blob/master/src/main/resources/application.yml#L40) file.
- You can customize ```database connection information``` in [*application.yml*](https://github.com/Genc/spring-boot-boilerplate/blob/master/src/main/resources/application.yml#L3) file.
- You can customize ```swagger information``` in [*application.yml*](https://github.com/Genc/spring-boot-boilerplate/blob/master/src/main/resources/application.yml#L45) file.
- You can customize ```which endpoints are accessible without token information``` in [*SecurityConfiguration.java*](https://github.com/Genc/spring-boot-boilerplate/blob/master/src/main/java/com/farukgenc/boilerplate/springboot/configuration/SecurityConfiguration.java#L45) file.

## Run the Application

First you need to make sure that the database is up.
If you're using Docker, you can use ```docker compose up -d``` command. (If you have made changes in local, you should use the *local-docker-compose* file.)

Navigate to the root of the project. For building the project using command line, run below command :

``` mvn clean install```

Run service in command line. Navigate to *target* directory.

``` java -jar spring-boot-boilerplate.jar ```

## Postman Collection

- [You can access the Postman collection here and you can try it after you get the project up and running.](https://www.postman.com/postmanfaruk/workspace/faruk-genc-projects/collection/11439300-3d0317df-f217-40ff-a2a6-4eaaf66e1c55?action=share&creator=11439300)

### Others

 - [For Angular]

### License

Apache License 2.0

   [For Angular]: <https://github.com/Genc/angular-boilerplate>
