# online-food-delivery-app
Online food delivery application with java and springboot swagger2
#Authored
kaushik


# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

# REST API for an Online Food Delivery Application

* A SpringBoot project which provides REST API for an Online Food Delivery system. This API performs all the fundamental CRUD
* operations of any Online Food Delivery platform with user validation at every step.

## Tech Stack

* Java
* Spring Framework
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL/H2/Postgres

## Modules

* Signup, Login/Logout Module
* Restaurant Module
* Customer Module
* Order and Items Module
* Bill Module

## Features

* Customer and Admin authentication & validation with session uuid.
* Admin Features:
    * Administrator Role of the entire application
    * Only registered admins with valid session token can add/update/delete restaurants or customer from main database
    * Admin can access the details of different customers, restaurants and orders
* Customer Features:
    * Registering themselves with application, and logging in to get the valid session token
    * Viewing list of available items and ordering it
    * Only logged in users view cart details, place an order, update and access other features
