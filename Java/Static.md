# Static


# Static or not

## Methods without the static modifier are instance methods. 
Instance methods are methods that are associated with an object, can process the objects variables and can call the object's other methods. Instance methods specifically CAN use the *this* modifier, which refers to the variables associated with the specific object, that is calling the instance method. 

## Methods with the static modifier are class methods
Class methods can't use the *this* modifier, meaning that they can only access the variables they are given as parameters or that they create themselves.
In reality class methods can also access class variable, among other things.

# static classes
static classes are classes that are "not about objects"
