# yargs

Utility to create command line tools


calling an argument will create a boolean for that key with the value "true":
```bash
node src/app.js --thisWillBeTrue --otherKey "Value of the otherKey"
```

The values are provided as an object that we get by calling "yargs.argv" (if yargs is the name of the import).
eg to run app using the arguments of the object returned:
```js
const yargs = require("yargs");

const app = (yargsObj) => {
    // do things using the values of the object
}

app(yargs.argv);
```
argv = argument vector