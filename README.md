## Second Mini-Project with Spring Data JPA
##### `Lab 3:` Spring Boot Data Access with Spring Data JPA and Database Connection
##### `Course:` Enterprise Applications in Java
##### `Master:` Software Engineering
##### `Institutions:` Polytechnic University of Tirana & Lufthansa Industry Solutions

---

##### `Application:` MySQLBookCRUDApplication
    Technology stack:
    1️⃣ Spring Boot
    2️⃣ Spring Web
    3️⃣ Spring Data JPA
    4️⃣ MySQL database
    5️⃣ Hibernate
    6️⃣ Docker 


The view on Postman:

Add new Book

`POST /api/books`

http://localhost:8080/api/books

![Add New Book](SpringDataJPAMySQLBookCRUDApplication/img/add.png "Add New Book")

Get All Books

`GET /api/books`

http://localhost:8080/api/books

![Get All Books](SpringDataJPAMySQLBookCRUDApplication/img/findAll.png "Get All Books")

Get Book By Id

`GET /api/books/{id}`

http://localhost:8080/api/books/{id}

![Get Book By Id](SpringDataJPAMySQLBookCRUDApplication/img/findById.png "Get Book By Id")

Get Book By Title

`GET /api/books?title=title`

http://localhost:8080/api/books?title=title

![Get Book By Title](SpringDataJPAMySQLBookCRUDApplication/img/findByTitle.png "Get Book By Title")

Edit Book

`PUT /api/books/{id}`

http://localhost:8080/api/books/{id}

![Edit Book](SpringDataJPAMySQLBookCRUDApplication/img/edit.png "Edit Book")

Delete Book By Id

`DELETE /api/books/{id}`

http://localhost:8080/api/books/{id}

![Delete Book By Id](SpringDataJPAMySQLBookCRUDApplication/img/deleteById.png "Delete Book By Id")

Delete All Books

`DELETE /api/books`

http://localhost:8080/api/books

![Delete All Books](SpringDataJPAMySQLBookCRUDApplication/img/deleteAll.png "Delete All Books")

