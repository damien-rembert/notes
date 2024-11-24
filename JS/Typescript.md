# Typescript

# Define the type of a variable

```typescript
let name: string = "hello";

// Can be either a string or null
let errorMessage: string | null = null;
```

# Define an object

```typescript
let user: { name: string; age: number } = { name = "Jo", age = 14 };
```

# Define the types in a function

```typescript
const myFunc = (name: string, over18: boolean): string => {
  return "name is: " + name;
};
```

# Interface

```typescript

// define the interface
interface UserInterface {
name: string;
age: number;
// this function will return a string
getMessage()?: string;
// the question mark makes this optional
optionalKey?: string;
}

let user: UserInterface = {name = "Jo", age= 14, optionalKey= true,};
let user2: UserInterface = {name = "Jo", age= 14, getMessage};
```

# Define type aliases

```typescript
type IDnumber = number;
type MaybeTags = string | null;

interface UserInterface {
  name: string;
  age: number;
  id: 3455;
}
```

# Return types

```typescript
const doSomething = (): void => {
  console.log("prout");
};
```

# keywords

```typescript

keyof
typeof
```

# type alias

```typescript
type userName = string;
type userBirthDate = Date | string | name;
type ContactStatus = "active" | "inactive" | "new";
```

# enums

```typescript
enum userStatus = string;
```

# interface

```typescript
interface User {
  id: number;
  name: string;
  status: userStatus;
}
```

# type alias

```typescript
type userName = string;
type userBirthDate = Date | string | name;
type ContactStatus = "active" | "inactive" | "new";
```

# enums

```typescript
enum userStatus = string;
```

# interface

```typescript
interface User {
  id: number;
  name: string;
  status: userStatus;
}

let primaryContact: Contact = {
  id: 12345,
  name: "Jamie Johnson",
  status: "active",
};
```

# Records and helper types

`Record` utility type can be used to create a new type by referencing the fields of another type.

Helpers to define a type:
`Partial` defines all properties as optional.
`Omit` defines properties that should be omitted.
`Pick` creates a new type using only the properties named by its second generic parameter.
`Required` turns all properties as required.

# Dispose of resources with "using" keyword

# Generics

# Decorators
