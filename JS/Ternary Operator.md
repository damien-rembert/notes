# Ternary Operator

The ternary operator uses a question mark ? and a colon : to replace an entire if...else statement with a single line of code. 
# example
test ? doThisIfTrue : elseDoThis.
condition ? exprIfTrue : exprIfFalse


condition

    An expression whose value is used as a condition.
exprIfTrue

    An expression which is evaluated if the condition evaluates to a truthy value (one which equals or can be converted to true).
exprIfFalse

    An expression which is executed if the condition is falsy (that is, has a value which can be converted to false).



function getFee(isMember) {
  return (isMember ? '$2.00' : '$10.00');
}

console.log(getFee(true));
// expected output: "$2.00"

console.log(getFee(false));
// expected output: "$10.00"

console.log(getFee(null));
// expected output: "$10.00"



