# API REST For a Food Delivery System 
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/luizjhonata/backenddeliveryfood/blob/main/LICENCE)

## About the project
The project consist in a API REST for a delivery food.

The Orders can have 4 possible status. 

- Pending;
- Accepted;
- Delivered;
- Canceled;

The Orders have 9 methods.

- Show ALL Orders ordered by id;
- Show all Orders PENDING ordered by moment ASC;
- Show all Orders ACCEPTED ordered by moment ASC;
- Show all Orders DELIVERED ordered by moment ASC;
- Show all Orders CANCELED ordered by moment ASC;
- Insert a NEW ORDER;
- Change OrderStatus to ACCEPTED;
- Change OrderStatus to DELIVERED;
- Change OrderStatus to CANCELED;

The Producs have 2 methods;

- Show ALL Products ordered by PRICE DESC;
- Insert a NEW PRODUCT;


## In this project i put in pratice my knoledge about: 
- Java;
- Spring Boot; 
- Jpa;
- H2; 
- PostGreSql; 
- MVC; 
- REST API;
- Relational Object Mapping;

## Conceptual Model 
![Web](https://github.com/luizjhonata/assetsreadme/blob/main/foodDeliveryBackEnd/conceptualModel.png)

## Layers Patterns
![Web](https://github.com/luizjhonata/assetsreadme/blob/main/foodDeliveryBackEnd/layerPatterns.png)

## How to run the project

Prerequisites: Java 11

```bash
# clone repository
git clone https://github.com/luizjhonata/backendjotafood

# enter in the back end project folder
cd backendjotafood

# run the project
./mvnw spring-boot:run
```
