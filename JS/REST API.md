# Rest API

Client-Server decoupling


// on the most basic level, when the user creates their account, they also get a unique token back. When they login, they also provide that token in the background, and if it's correct, we log them in. In our app, we're basically taking their user info and their token and comparing them against our database, and logging them in if they get it right

## Endpoints have:
http method/verb
path
controller

## http method/verb
GET: return static info/read a database CANNOT SEND BODY
POST: database is sent through the http request 
PUT/PATCH: handle update request PUT replaces completely and PATCH replaces partially
DELETE: CANNOT SEND BODY


## path/route
the url that target a specific endpoint
```js
movieRouter.delete("/movie/:filterKey/:filterVal", deleteMovie);
// for example for delete: "http://local:5001/movie/title/Spiderman" title would be req.params.filterKey and Spiderman req.params.filt
```
## controller
a function that triggers when an endpoint is hit, takes two arguments, the request object and the response object

get and delete do not accept bodies


# in GET and DELETE
Authorization tokens should be sent in the Header using the key "Authorization" and the value "Bearer HERE_IS_THE_TOKEN" using the bearer schema


# Passing variables and object when JSON is required
```js
        // we use stringify here so we can pass any JS object
        const response = await fetch(`${process.env.REACT_APP_REST_API}user`, {
            method: "POST",
            headers: {"Content-Type": "application/json"},
            body: JSON.stringify({
                username: username,
                email: email,
                password: pass
            })
        });
```

# Making json more js friendly

```js
        const data = await response.json();
```

```bash
# MOVIE

# list all films
curl -X GET http://localhost:5000/movie
# add "testo film" to the db (no need to indicate post as it is the default)
curl -d '{"title": "testo film"}'  -H 'Content-Type: application/json' http://localhost:5000/movie
# add "testo 2" with actors (no need to indicate post as it is the default)
curl -d '{"title": "testo 2", "actors": ["John", "Tom"]}' -H 'Content-Type: application/json' http://localhost:5000/movie
# delete "testo film"
curl -X DELETE -H 'Content-Type: application/json' "http://localhost:5000/movie/title/testo%20film"
# delete "testo 2" using an actor
curl -X DELETE -H 'Content-Type: application/json' "http://localhost:5000/movie/actors/Tom"
curl -X PATCH -d '{"filterKey": "title", "filterVal": "testo film", "updateKey": "actors", "updateVal": ["Tom", "Mark", "Lucas"]}'  -H 'Content-Type: application/json' http://localhost:5000/movie


# USER

# create user POST http://localhost:5000/user body.username, body.email, body.password
curl -d '{"username": "pajojo", "email": "pajojo@gmail.com", "password": "test123"}'  -H 'Content-Type: application/json' http://localhost:5000/user
    # {"user":"pajojo","token":"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjMyMjg3NGI4OTQzZDNjOTc5NTRmZTMiLCJpYXQiOjE2NDc0NTQzMjR9.alJsG5W6ZrEs82x0PN3dYvxNEHD2JAqa_WMr9R_lH50"}

# // full login POST http://localhost:5000/login body.username and body.password
curl -d '{"username": "pajojo", "password": "test123"}'  -H 'Content-Type: application/json' http://localhost:5000/login

# // token login GET http://localhost:5000/user   header.Authorization: "Bearer TOKEN"
curl -X GET -H 'Content-Type: application/json' -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjMyMjg3NGI4OTQzZDNjOTc5NTRmZTMiLCJpYXQiOjE2NDc0NTQzMjR9.alJsG5W6ZrEs82x0PN3dYvxNEHD2JAqa_WMr9R_lH50" http://localhost:5000/user

# // update password PATCH http://localhost:5000/user body.password, header bearer token,
curl -X PATCH -d '{"password": "test321"}'  -H 'Content-Type: application/json'  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjMyMjg3NGI4OTQzZDNjOTc5NTRmZTMiLCJpYXQiOjE2NDc0NTQzMjR9.alJsG5W6ZrEs82x0PN3dYvxNEHD2JAqa_WMr9R_lH50" http://localhost:5000/user

# check it worked with full login
curl -d '{"username": "pajojo", "password": "test321"}'  -H 'Content-Type: application/json' http://localhost:5000/login

# delete user
curl -X DELETE -H 'Content-Type: application/json'  -H "Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJfaWQiOiI2MjMyNWE4NDYxOTBlZmIyM2NjMTVkY2UiLCJpYXQiOjE2NDc0NjcxNDB9.nNQAbB0wwIg2dCqKGg96IixVL1TmIFXiPUuq-Lbcwi4" http://localhost:5000/user


```
