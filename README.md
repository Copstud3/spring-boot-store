# Spring Boot Store (store_api)

A Spring Boot-based e-commerce/store application exposing REST APIs and a minimal admin UI. This repository contains a production-ready starter for a store backend with features for product management, orders, payments, authentication, and database migrations.

## Key features

- REST APIs for products, customers, carts, orders, and payments
- JWT-based authentication and role-based authorization
- Persistence with Spring Data JPA and MySQL
- Database migrations powered by Flyway
- Server-side views (admin/user pages) using Thymeleaf
- OpenAPI / Swagger UI for API documentation (springdoc)
- Stripe integration for payments
- Validation, mapping (MapStruct), and helpful developer tooling (DevTools, Lombok)

## Tech stack

- Java 21
- Spring Boot (Web, Data JPA, Security, Thymeleaf)
- MySQL (runtime)
- Flyway for DB migrations
- MapStruct for DTO mapping
- Lombok for boilerplate reduction
- SpringDoc OpenAPI for API docs
- Stripe Java SDK for payments

## Prerequisites

- Java 21 JDK
- Maven 3.8+
- MySQL server (or a compatible database)
- (Optional) A Stripe account for payment testing

## Configuration

This project loads configuration from standard Spring Boot properties or environment variables. Common properties you should set in application.properties or via environment variables / a `.env` file include:

- SPRING_DATASOURCE_URL (e.g. jdbc:mysql://localhost:3306/store_api?createDatabaseIfNotExist=true)
- SPRING_DATASOURCE_USERNAME (e.g. root)
- SPRING_DATASOURCE_PASSWORD (your-db-password)
- SPRING_PROFILES_ACTIVE (optional, e.g. dev, prod)
- JWT_SECRET (secret used to sign JWTs)
- STRIPE_SECRET_KEY (for Stripe integration)

This project also includes `springboot4-dotenv` which can load settings from a `.env` file in development.

## Database migrations

Flyway is configured in this project. On application startup migrations will run automatically (if enabled). You can also run migrations with Maven:

```sh
mvn -Dflyway.configFiles=src/main/resources/flyway.conf flyway:migrate
```

Adjust the command or configuration to match your environment.

## Running locally

1. Clone this repository:

```sh
git clone https://github.com/Copstud3/spring-boot-store.git
cd spring-boot-store
```

2. Configure environment variables or `application.properties` (see Configuration above).

3. Build and run with Maven:

```sh
mvn clean package
mvn spring-boot:run
# or run the packaged jar
java -jar target/*.jar
```

4. Open API docs in your browser (common paths):

- http://localhost:8080/swagger-ui.html
- http://localhost:8080/swagger-ui/index.html
- or the OpenAPI UI path configured in springdoc

## Stripe / Payments

Set your Stripe keys (STRIPE_SECRET_KEY) before testing payment flows. Use Stripe test API keys when developing.

## Development tips

- Use an IDE (IntelliJ IDEA, Eclipse) to run the application and tests.
- DevTools is included for auto-restart during development.
- Lombok and MapStruct require IDE support/plugins to avoid compilation warnings in the editor.

## Contributing

Contributions are welcome. Open issues or pull requests for bug fixes, improvements, or new features. Include tests and a short description of the change.

## License

No license is specified in this repository. Add a LICENSE file if you want to make the terms explicit.
