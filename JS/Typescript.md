# Typescript

# Define the type of a variable

let name: string = "hello";

// Can be either a string or null
let errorMessage: string | null = null;

# Define an object
let user: {name: string, age: number} =  {name = "Jo", age= 14,};

# Define the types in a function
const myFunc = (name: string, over18: boolean): string => {
return "name is: " + name;
};

# Interface
// define the interface
interface UserInterface {
name: string;
age: number;
// this function will return a string
getMessage()?: string;
// the question mark makes this optional
optionalKey?: string;
}

let user: UserInterface =  {name = "Jo", age= 14, optionalKey= true,};
let user2: UserInterface =  {name = "Jo", age= 14, getMessage};



# Define type aliases
type IDnumber = number;
type MaybeTags = string | null;

interface UserInterface {
name: string;
age: number;
id: 3455;
}

# Return types
const doSomething = (): void => {
console.log("prout");
};
