# arrays

Is this going to be pushed to github?

```JS
let myArray = [5 , 'hello', ['another array', 89]];
myArray[0] = 1;
```
We can also add, remove, append, modify, copy..

## .push()
add an item at the end of the array
```JS
let coffeeOrder = [
"Alex - Cortado",
"Ben - Cortado",
"Charlie - Whatever's new"
];
coffeeOrder.push("Donna - espresso");
```

## .pop()
remove an item at the end of the array
```JS
let coffeeOrder = [
"Alex - Cortado",
"Ben - Cortado",
"Charlie - Whatever's new"
];
coffeeOrder.pop();
```

## .map()
```JS
const customer = [
        {first_name:    "Aleshia",    last_name:    "Tomkiewicz",    phone:    11835703597},
        {first_name:    "Edgar",    last_name:    "Kanne",    phone:    11326532337},
        {first_name:    "Dewitt",    last_name:    "Julio",    phone:    11253528327},
        {first_name:    "Charisse",    last_name:    "Spinello",    phone:    11719831436}];
// Create an array of Customers first names with .map()

        const cust1stName = customer.map(function(customer){
                return customer.first_name;
});

        console.log(cust1stName)
```

## .forEach()
loop over the array
```js
fruits.forEach(function(item, index, array) {
  console.log(item, index)
})
```

## .shift()
remove an item from the front of an array

## .unshift()
add an item to the front of an array

## .splice()
Remove an item by index position
```js
let removedItem = fruits.splice(pos, 1) // this is how to remove an item
```

## .slice()
The `.slice()` method returns a shallow copy of a portion of an array into a new array object selected from start to end (end not included) where start and end represent the index of items in that array. The original array will not be modified.


## .length property
https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array






