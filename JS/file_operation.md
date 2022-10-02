# File operation


# import file system
```js
const fs = require("fs");
```

# Operation
make function that rely on fs async 
use try/catch

# Function
.readFileSync([PATH_OF_FILE]) to read file
.writeFileSync([PATH_OF_FILE]) to write to file
eg: 
```js
async add() {
    try {
        const addArr = await fs.readFileSync("./storage.json");
        movieArr = await JSON.parse(addArr);
    } catch (error){
        movieArr = [];
    }
    movieArr.push(this);
    const stringyArr = await JSON.stringify(movieArr);
    fs.writeFileSync("./storage.json", stringyArr);
}
```