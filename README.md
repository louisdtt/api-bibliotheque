# Library API
Spring API to manage user, books and comments from a library.


# Open Endpoints
* Sign in : `POST /signin/`
```json
{
    "login": 123,
    "password": "password"
}
```
* Sign up : `POST /signup/`
```json
{
    "name": "Lucas",
    "age": 10,
    "login": "lucas",
    "password": "1234"
}
```


# Endpoints that require Authentication
## User
* Get all users : `GET /user/`
* Get a user by id : `GET /user/{id}/`
* Search a user by name : `GET /user/search/{name}/`
* Update a user : `PUT /user/{id}/`
```json
{
    "name": "update",
    "age": 10,
    "category": "Enfant"
}
```
* Delete a user : `DELETE /user/{id}/`
* Borrow a book from this user : `POST /user/{userId}/book/{bookId}/`

## Book
* Get all books : `GET /book/`

* Get a book by id : `GET /book/{id}/`

* Search a book by title : `GET /book/search/{title}/`

* Add a book : `POST /book/`
```json
{
    "id": 7,
    "title": "Dictionnaire",
    "category": "adulte",
    "author": "Larousse",
    "cover": "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg"
}
```

* Update a book : `PUT /book/{id}/`
```json
{
    "id": 7,
    "title": "Dictionnaire",
    "category": "adulte",
    "author": "Larousse",
    "cover": "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg"
}
```

* Delete a book : `DELETE /book/{id}/`

## Comment
* Get all comments : `GET /comment/`

* Get a comment by id : `GET /comment/{id}/`

* Search a comment by title : `GET /comment/search/{title}/`

* Add a comment : `POST /book/`
```json
{
    "id": 13,
    "title": "Un nouveau commentaire.",
    "content": "Contenu du commentaire.",
    "customer_id": 1,
    "book_id": 1
}
```

* Update a comment : `PUT /comment/{id}/`
```json
{
    "id": 13,
    "title": "Un nouveau commentaire modifié.",
    "content": "Contenu du commentaire.",
    "customer_id": 1,
    "book_id": 1
}
```

* Delete a comment : `DELETE /comment/{id}/`


# Test Insomnia
Import Insomnia_2020-12-18.json on Insomnia.


# Authors
FONTAINE Pierre & PASQUALINI Lucas & DROISSART Nicolas & DUTOIT Louis
