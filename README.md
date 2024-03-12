# Cart Service
This is a Spring Boot application that functions as a Cart Service, which internally makes API calls to the Fake Store API. This follows MVC architecture and includes CRUD operations.
This is a RESTApi which returns the JASON response.

Url for the FakeStoreApi: https://fakestoreapi.com

Localhost: http://localhost:8080/carts

## How to

### GET:

**Get All Carts:**

`http://localhost:8080/carts`

![image](https://github.com/kauxp/Contest/assets/145500535/b077378b-6937-486a-a61a-1fc7402d1729)


**Get a Single Cart Based on id:**

`http://localhost:8080/carts/1`

![image](https://github.com/kauxp/Contest/assets/145500535/de26e8b9-0ae8-4d85-823b-ef7b60ffff11)


**Get Carts in a Date Range:**
`http://localhost:8080/carts?startdate=2020-10-03&enddate=2020-12-12`

**Get Carts By User id:**

`http://localhost:8080/carts/user/1`

![image](https://github.com/kauxp/Contest/assets/145500535/9108ada5-19ca-4e90-a12e-869df011d81d)


**Get User Carts in a Date Range:**
`http://localhost:8080/carts/user/1?startdate=2020-10-03&enddate=2020-12-12`

### POST:
`http://localhost:8080/carts`

### PUT, PATCH:
`http://localhost:8080/carts/1`

### DELETE:
`http://localhost:8080/carts/1`
