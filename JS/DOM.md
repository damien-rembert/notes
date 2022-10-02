# DOM and JS



# .addEventListener("event, function)
const buttonID = document.getElementById("submit");
buttonID.addEventListener("click", () => {imageID.src = inputID.value;})


# using the CSS selector nth-child()
const listItems = document.querySelectorAll("li:nth-child(even)");

# .getElementById .getElementByClass .getElementByTagName
const myElement = document.getElementById("myId");
const list = document.getElementsByTagName(“li");
const notOrange = document.getElementsByClassName("not-orange");

# querySelector 
flexible, and versatile, accepts id, tag name, class
document.querySelectorAll("li"); > returns an array with all the elements
document.querySelector("li"); > returns the first occurrence


const myElement = document.getElementById("myId");
IS EQUAL TO
const myElement = document.querySelector("#myId");
These code are functionally identical.

# .createElement('HTML tag eg li')


# .innerHTML 
value for html elements like children 
eg could be used to add <li>  list items to a <ul> unordered list.

# .textContent
text value for the content inside of hmtl elements, eg between <p> and </p>