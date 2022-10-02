# Sequelize





const User = sequelize.define('user', { username: Sequelize.STRING });
const Task = sequelize.define('task', { title: Sequelize.STRING });
User.hasMany(Task);
Task.belongsTo(User);






# Relationships
## one-to-many
```js
Team.hasMany(Player);
Player.belongsTo(Team);
```

# Limits and Pagination

```js
// Fetch 10 instances/rows
Project.findAll({ limit: 10 });

// Skip 8 instances/rows
Project.findAll({ offset: 8 });

// Skip 5 instances and fetch the 5 after that
Project.findAll({ offset: 5, limit: 5 });


// same with condition
model.findAll({
  limit: 2,
  offset: 3,
  where: {}, // conditions
});


// or use findAndCountAll
// which will return counts and before an array of rows found
// {
//     "count": 3,
//     "rows": [
//         {
//             "id": 3,
//             "title": "bezkoder Tut#3 Node.js Express",
model.findAndCountAll({
  limit: 2,
  offset: 3,
  where: {}, // conditions
});

```

# Count items in DB

```js
console.log(`There are ${await Project.count()} projects`);
```

# console.log()-ging an instance

here jane is an instance of the User class:
```js
console.log(jane.toJSON()); // This is good!
console.log(JSON.stringify(jane, null, 4)); // This is also good!
```

# structure

/app
    /config
    db.config.js(/connection.js?)
    /controllers
    item.controller.js
    /models
    comment.model.js
    index.js
