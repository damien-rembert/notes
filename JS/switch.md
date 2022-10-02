# switch statements


A switch is made up of case blocks, it also has an (optional) default
The break keyword prevents the execution of the code blocks of the following cases

switch (true) means the condition in the cases will be evaluated


const grade = 87;

switch (true) {
    case grade >= 70:
        console.log("Distinction");
        break;
    case grade >= 60:
        console.log("Merit");
        break;
    case grade >= 50:
        console.log("Pass");
        break;
    default:
        console.log("Failed");
}

let car = "Peugeot";
switch(car){
case "Ford":
case "GM":
console.log("You've got an American car!");
break;
case "Peugeot":
case "Citroen":
console.log("You've got a French boy!");
break;
case "Honda":
case "Toyota":
case "Suzuki":
console.log("Japanese cars are dead quiet!");
break;
case "Mercedes":
console.log("You are proper posh German!");
break;
case "Volkswagen":
console.log("German aren't that bad at all!");
break;
case "Hyundai":
case "Kia":
console.log("South Korean cars are getting popular!");
break;
default:
console.log("Your car is not in the top ten companies in the world!!");
}




