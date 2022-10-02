# Date

## look into date package

```js
let day = 1000 * 60 * 60 * 24;
// console.log(day);
let today = new Date();
let birthDay = new Date(2022, 05, 24);

let toBDay = Math.floor((birthDay - today) / day);
console.log(`${toBDay} days to birthday.`)

//// days since birth
let birthDate = new Date(1985, 05, 24);

let lifeInDays = Math.round(Math.abs((birthDate.getTime() - today.getTime())/(day)));

console.log(`${lifeInDays} days since birth.`);
```
