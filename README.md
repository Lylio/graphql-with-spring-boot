# GraphQL with Spring Boot

### Description
GraphQL for beginners: a simple GraphQL server with Spring Boot.

|              |                                                                                                                                                                                                                                        |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Tech Stack   | ![GraphQL](https://img.shields.io/badge/GraphQL-E10098.svg?style=for-the-badge&logo=GraphQL&logoColor=white) ![Spring Boot](https://img.shields.io/badge/spring%20boot-white.svg?style=for-the-badge&logo=springboot&logoColor=6DB33F) |
| Compiler     | ![Java](https://img.shields.io/badge/JAVA%20-JDK%2011-green?style=for-the-badge)                                                                                                                                                       |                                                                                                                                                                                                                                                                                               |
| Top Language | ![Github Language](https://img.shields.io/github/languages/top/lylio/cookie-contacts?style=for-the-badge)                                                                                                                              |
| Repo Size    | ![Repo Size](https://img.shields.io/github/repo-size/lylio/cookie-contacts?style=for-the-badge)                                                                                                                                        |
| Last Commit  | ![Github Commit Activity](https://img.shields.io/github/last-commit/lylio/cookie-contacts/main?style=for-the-badge)                                                                                                                    |


### Launch
1. Launch app with `mvn spring-boot:run`
2. Navigate to the query interface at http://localhost:8080/graphiql

### Test Queries

1. Create a vehicle with the following query:
```graphql
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}
```
This will create a row in the Vehicle table. The confirmation output should be:

```graphql
{
  "data": {
    "createVehicle": {
      "id": "1"
    }
  }
}
```
2. Then run a query to get the data:

```graphql
query {
  vehicles(count: 1) 
  {
    id, 
    type, 
    modelCode
}
}
```
The output should be:
```graphql
{
  "data": {
    "vehicles": [
      {
        "id": "1",
        "type": "bus",
        "modelCode": "XYZ123"
      }
    ]
  }
}
```

Experiment by creating more Vehicles and changing the number of the `count` variable. Also, try fetching only specific fields.

<br />

### Acknowledgements
- Based on the DZone article [Beginners Guide to GraphQL with Spring Boot](https://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot)
- The cool repo badges, logos and code stats included in this README are courtesy of [Simple Icons](https://simpleicons.org/) and [Shields.io](https://shields.io/)