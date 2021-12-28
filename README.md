# CashierBackend
BackendCashierApp

![image](./docs/DB.png)

Ref
https://dbdiagram.io/d/61c9bf203205b45b73ce0d6b

# Feature
1. Login  
    - email ,password
    - google 
3. Register
    - google
    - email,password
4. Create Store
    - Create Branch(for first auto generate main branch)
    - Update Branch
    - Delete Branch
5. Employees
    - Add employe to branch
    - edit employe
    - 
   
6. Products
    - add new product
    - purchase
        - update stock
        
    - sale
        - update stock
7. Orders
    - order
        - payment
    - hold order
8. 

# Flow
1. User
   - User Login -> Update Store -> Add Branch
   - User register -> Create Store -> Add Branch
   - User Login -> Branch ->Add Employee
   - User Reset Password -> Check Email
   - Add new Supplier
   - Edit Supplier
   - Edit Product 
   - Add New Product 
   - Delete Product
2. Employee
   - Login
   - Purchase Product from suppliers
   - Add new Supplier
   - Edit Supplier
   - Edit Product
   - Add New Product
   - Delete Product
   - Sale Product to customer

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.2/maven-plugin/reference/html/#build-image)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-security)
* [Validation](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-validation)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.2/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

