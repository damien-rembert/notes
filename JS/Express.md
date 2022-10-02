# Express

Req/Request and Res/Response are objects.

JWT? JSON W Token package (for hashing and verifying tokens)


server.js is the equivalent of the app.js in the context of the server => the first file called


app.use() adds functions to the app (the app being express).
eg: app.use(express.json())

itemModel.js => defines the schema
itemController.js => manipulates the data (CRUD operations)
itemRoutes.js => the middleware


get and delete do not have bodies => use params for non-sensitive info

# url path can be captured and used through params:
eg:
```js
// in server.js
movieRouter.delete("/movie/:filterKey/:filterVal", deleteMovie);
// in movieController.js (surrounded with try/catch)
exports.deleteMovie = async (req, res) => {
  try {
    const deletedMovie = await Movie.deleteOne({
      [req.params.filterKey]: req.params.filterVal,
    });
    if (deletedMovie.deletedCount > 0) {
      res.status(200).send({ msg: "Successfully deleted movie" });
    } else {
      throw new Error("Did not delete");
    }
  } catch (error) {
    console.log(error);
    res.status(500).send({ err: error.message });
  }
};

```

# middleware


# jwt/jsonwebtoken
tokens have to be sent in the header with key name "Authorization" and "Bearer " in front of its value
```js
// in userControllers.js
exports.addUser = async (req, res) => {
  try {
    const newUser = await User.create(req.body);
    const token = await jwt.sign({ _id: newUser._id }, process.env.SECRET);
    res.status(200).send({ user: newUser.username, token });
  } catch (error) {
    console.log(error);
    res.status(500).send({ err: error.message });
  }
};

```

# bcryptjs
