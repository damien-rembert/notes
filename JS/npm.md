# npm


## npm init
USE .gitignore FILE SO THE MODULE ARE NOT PUSHED TO REMOTE REPO

in your project folder, run `npm init -y`
the -y flag create a default package.json file

## easy way to create a react project
```bash
npx create-react-app <project-name>
```


## npm install
USE .gitignore FILE SO THE MODULE ARE NOT PUSHED TO REMOTE REPO

### installing a module
USE .gitignore FILE SO THE MODULE ARE NOT PUSHED TO REMOTE REPO

```bash
npm install lodash
# OR
npm i lodash
# OR
npm i --save-dev jest
```

```javascript
const _ = require("lodash");
```
### installing all the dependencies defined in package.json (eg in a recently cloned repo)
USE .gitignore FILE SO THE MODULE ARE NOT PUSHED TO REMOTE REPO

```bash
npm install
```


adds it to the package.json
individual modules still need to be imported in your js