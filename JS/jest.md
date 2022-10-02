# jest

# install jest
```bash
npm i --save-dev jest
# or for React
npm install --save @testing-library/react @testing-library/jest-dom
```


## edit in package.json (scripts/test)
```json
"scripts": {
    "test": "jest"
},
```
OR for html files + more in depth analysis results
```json
  "scripts": {
    "test": "jest --coverage"
  },
```

# in the file to be tested (jest_test.js)
```js
const add = (num1, num2) => {
    return (num1 + num2);
};
// console.log(add(5,6)); // returns 11
module.exports = {
    add,
};
```

# in the test file (jest_test.test.js)
```js
const {add} = require("./jest_test");

// first param is a string description of the test
test("two numbers add up", () => {
    expect(add(1, 2)).toBe(3);
});
```

```js
// this tests it's not the same object
// then that the content is equal
test("return is a copy", () => {
    expect(copyArray(array)).not.toBe(array);
    expect(copyArray(array)).toEqual(array); 
})
```

# grouping tests using describe method
```js
describe("All the tests for the button", () => {
    test("testing the button is rendered", () => {...})
    test("more tests on the button", () => {...})
}
) 
```


# running tests
```bash
npm test
```
