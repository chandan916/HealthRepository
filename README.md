# HealthRepository

## Installation
- Just clone this repository
- Run mvn install
- Then run,mvn spring-boot:run
- Application will be running on port 9090


## List of Api
- To get All patient details (http://localhost:9090/patients)
- To save patient details (http://localhost:9090/addPatient)
- To update patient details (http://localhost:9090/updatePatient)
- To delete patient details (http://localhost:9090/patient/2)

## Major Libraries/Framework used
- log4j -> is used for logging purpose.
- mapstruct -> is used for generating mapper.
- spring-boot-starter-validation -> is used for validation of fields.
- H2database -> is used as database.
- JPA -> used for binding Java objects to records in a relational database.

## Postman Collection
- Postman collection is also added for api
  - a) To import postman collection goto postman
  - b) file->import->file->upload files(select the postman collection file i.e., HealthPortal.postman_collection.json)
