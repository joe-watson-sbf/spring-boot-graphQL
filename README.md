# GRAPHQL DEMO 

This is a simple demo of a GraphQL server using Spring Boot and Java.

### Prerequisites

- Java 17
- Gradle 7.2
- Spring Boot 3.2.5

### Running the application

After cloning the repository, navigate to the root directory and run the application using the following command:

- `./gradlew bootRun`
- The application will start on port 8080
- Open a browser and navigate to `http://localhost:8080/graphiql` to access the GraphiQL interface
- You can now run queries and mutations against the GraphQL server

### Sample Queries

- Query all products
```
{
  products {
    id
    name
    price
    description
  }
}
```

- Query a single product
```
{
  product(id: 1) {
    id
    name
    price
    description
  }
}
```

- Mutation to create a new product
```
mutation {
  createProduct(name: "Product 13", price: 130.0, description: "Description 13") {
    id
    name
    price
    description
  }
}
```