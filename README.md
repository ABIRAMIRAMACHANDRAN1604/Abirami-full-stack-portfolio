<<<<<<< HEAD
# Full-Stack Portfolio Starter

This workspace now contains a starter portfolio website with:

- `frontend/` -> Angular 17 standalone application
- `backend/` -> Spring Boot 3 REST API
- Database support for `MySQL` by default, with `PostgreSQL` config included

## Frontend features

- Portfolio home, about, skills, projects, and contact sections
- Responsive modern layout based on your provided HTML content
- Angular reactive contact form
- API integration with the Spring Boot backend

## Backend features

- `POST /api/contact` endpoint
- Validates incoming contact form data
- Saves messages into a SQL database using Spring Data JPA
- CORS enabled for Angular at `http://localhost:4200`

## Run the frontend

```bash
cd frontend
npm install
npm start
```

Open `http://localhost:4200`

## Run the backend

```bash
cd backend
mvn spring-boot:run
```

Open `http://localhost:8080`

## Database setup

Create a database named:

```sql
CREATE DATABASE portfolio_db;
```

### MySQL

Edit `backend/src/main/resources/application-mysql.properties` and set your MySQL username/password.

### PostgreSQL

If you want PostgreSQL instead of MySQL:

1. Open `backend/src/main/resources/application.properties`
2. Change:

```properties
spring.profiles.active=mysql
```

to:

```properties
spring.profiles.active=postgres
```

3. Update `backend/src/main/resources/application-postgres.properties` with your PostgreSQL username/password.

## Important note

Your original HTML used an image and a PDF resume. In Angular, you can place them here:

- `frontend/src/assets/profile.jpg`
- `frontend/src/assets/resume.pdf`

Then update the template to point to those asset paths if you want them displayed.
=======
# Abirami-full-stack-portfolio
Responsive full-stack portfolio website using Angular, Spring Boot, REST API, and MySQL.
>>>>>>> 29b6e8e370be9b0b60e5a5290d57d53a6cb85938
