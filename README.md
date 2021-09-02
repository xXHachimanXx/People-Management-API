# People-Management-API
> REST API with Spring Boot for registering and managing people in an organization. Deploying the application was done in the cloud (Heroku).

## How to run
To run the project on the terminal, type the following command:
```sh
mvn spring-boot:run
```

Afterwards, open the following address to view the project execution:
```
http://localhost:8080/api/v1/people
```
## HTTP Verbs

| Url | Method | Description | Request Stream | Response Stream | Status Code Returned |
| --- | ------ | ----------- | -------------- | --------------- | -------------------- |
| /people | GET | All people in the system | n/a | **Person** collection | 200/404 |
| /people/{id} | GET | Get specific **Person** | n/a | **Person** | 200/404 |
| /people | POST | Creates a new **Person** entity in the system. Expects a representation of the person on the body | **Person** without the Id specified | **Person** | 201/404 |
| /people/{id} | PUT | Modifies a **Person** resource | **Person** | n/a | 200/404 |
| /people/{id} | DELETE | Deletes a **Person** resource | n/a | n/a | 200/404 |

