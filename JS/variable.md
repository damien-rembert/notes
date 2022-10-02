# variable

# var variables

    var varName = "this is a string";
    varName = "new value"
    [...]
    var varName = "Oh no! I have forgotten that varName already exists and accidentally overwritten it by redeclaring it!"

OR

    var greeter = "hey hi";
    var times = 4;
    if (times > 3) {
        var greeter = "say Hello instead";
    }
    console.log(greeter) // "say Hello instead"

This is a problem when you do not realize that a variable greeter has already been defined before.

**CANNOT HAPPEN WITH LET, LET RETURNS AN ERROR WHEN REDECLARED**


# let variables

    let greeting = "say Hi";
    let greeting = "say Hello instead"; // error: Identifier 'greeting' has already been declared

However since the scope is different, this works:

    let greeting = "say Hi";
    if (true) {
        let greeting = "say Hello instead";
        console.log(greeting); // "say Hello instead"
    }
    console.log(greeting); // "say Hi"

# const variables

    const greeting = "say Hi";
    greeting = "say Hello instead";// error: Assignment to constant variable.

**CANNOT BE UPDATED OR REDECLARED**

While a const object cannot be updated, the properties of this objects can be updated
