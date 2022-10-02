# Spread operator

Iterates through the rest of the object/array
Can be used to do a shallow copy of an array to another array, or to add the content of an array to an array (otherwise the array itself will be added inside an array)

# Example
```javascript
let weekDays = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Sat', 'Sunday'];
// creating the variables
let firstDay, secondDay, thirdDay, everyOtherDay;
// using the spread operator
[firstDay, secondDay, thirdDay, ...everyOtherDay] = weekDays;
console.log(firstDay); // Monday
console.log(secondDay); // Tuesday
console.log(everyOtherDay); // [ 'Thursday', 'Friday', 'Sat', 'Sunday' ]
```






