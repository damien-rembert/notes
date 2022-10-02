# objects
let myObject = {type:"Fiat", model:"500", color:"white"};


const cafe = {
name: "Whitesheep",
seatingCapacity: 100,
hasSpecialOffers: true,
drinks: [
"Cappuccino",
"Latte",
"Filter coffee",
"Tea",
"Hot chocolate"
]
};



# classic function declaration
let pet = {
    name: "The Beast",
    typeOfPet: "cow",
    age: 45,
    colour: "blue",
    drink() {
        return `${this.name} is drinking`
    }
}

console.log(pet.drink());

# anonymous function declaration
let pet = {
    name: "The Beast",
    typeOfPet: "cow",
    age: 45,
    colour: "blue",
    drink: function() {
        return `${this.name} is drinking`
    }
}

console.log(pet.drink());

# computed property name
```js
let name = Roger;
let age = 12;
let key = over18;
let value = true;
let isOver18 = false;
let person = {name, age, [key]: value};
person.height = 180;
console.log(person);
// making the value of person.name the String Roger
let person1 = {name};

```


# Object destructuring

## Export file
```javascript
const myObject = {name: "Jon", age: 15, job: "banker"};
console.log()

```

```javascript
const myObject = {}

```
