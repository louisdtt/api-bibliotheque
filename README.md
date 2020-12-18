# Library API
Spring API to manage user, books and comment from a library.


# Open Endpoints
* Sign in : `POST /signIn/`
```json
{
    "login": 123,
    "password": "password"
}
```
* Sign up : `POST /signUp/`
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
* Get all users : `GET api/user/`
* Get a user by id : `GET api/user/{id}/`
* Search a user by name : `GET api/user/search/{name}/`
* Update a user : `PUT api/user/{id}/`
```json
{
    "name": "update",
    "age": 10,
    "category": "Enfant"
}
```
* Delete a user : `DELETE api/user/{id}/`
* Borrow a book from this user : `POST api/user/{userId}/book/{bookId}/`

## Book
* Get all books : `GET api/book/`

* Get a book by id : `GET api/book/{id}/`

* Search a book by title : `GET api/book/search/{title}/`

* Add a book : `POST api/book/`
```json
{
    "id": 7,
    "title": "Dictionnaire",
    "category": "adulte",
    "author": "Larousse",
    "cover": "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg"
}
```

* Update a book : `PUT api/book/{id}/`
```json
{
    "id": 7,
    "title": "Dictionnaire",
    "category": "adulte",
    "author": "Larousse",
    "cover": "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Fahrenheit451HUNcover.jpg/250px-Fahrenheit451HUNcover.jpg"
}
```

* Delete a book : `DELETE api/book/{id}/`

## Comment
* Get all comments : `GET api/comment/`

* Get a comment by id : `GET api/comment/{id}/`

* Search a comment by title : `GET api/comment/search/{title}/`

* Add a comment : `POST api/book/`
```json
{
    "id": 13,
    "title": "Un nouveau commentaire.",
    "content": "Contenu du commentaire.",
    "customer_id": 1,
    "book_id": 1
}
```

* Update a comment : `PUT api/comment/{id}/`
```json
{
    "id": 13,
    "title": "Un nouveau commentaire modifié.",
    "content": "Contenu du commentaire.",
    "customer_id": 1,
    "book_id": 1
}
```

* Delete a comment : `DELETE api/comment/{id}/`


# Test Insomnia
Import /api/Insomnia_API_Bibliotheque.json on Insomnia.


# Authors
FONTAINE Pierre & PASQUALINI Lucas & DROISSART Nicolas & DUTOIT Louis
