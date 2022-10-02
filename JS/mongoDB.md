# MongoDB

Use environment variables with dotenv and put sensitive data in `.env` file in project top folder.
Use `.gitignore` to ensure `.env` is not sent to the repo



# set-up
```bash
 mkdir projectName
 cd mongoDB
 npm init -y
 mkdir src
 touch src/app.js
 mkdir src/db
 touch src/db/connection.js
 touch src/db/connection.test.js
 npm i mongodb yargs dotenv
```
## in /.env
```bash
MONGO_URI="mongodb+srv://<username>:<password>@clusterino.ktjib.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"
```
## in /src/db/connection.js

```js
require("dotenv").config();
const { MongoClient } = require("mongodb");
const client = new MongoClient(process.env.MONGO_URI);

const connection = async () => {
    try {
        await client.connect();
        const db = client.db("Movies");
        return db.collection("Film");
    } catch (error) {
        console.log(error);
    }
};

module.exports = { client, connection };
```
# CRUD
https://www.mongodb.com/developer/quickstart/node-crud-tutorial/P
## Create one document/multiple
insertOne()/insertMany()
## Read one document/multiple
findOne()
## Update
updateOne()
## Delete
deleteOne()