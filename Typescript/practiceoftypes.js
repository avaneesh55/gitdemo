var helloWorld = "Hello World";
console.log(helloWorld);
var employeeName = 'Alex';
console.log(employeeName);
var employeeDept = 'HR';
console.log(employeeDept);
//ES5
var AlexDetails1 = employeeName + " works in the " + employeeDept + " department.";
console.log(AlexDetails1);
// //Es6
// let AlexDetails2 : string = ${employeeName} works in the ${employeeDept} department.;
// console.log(AlexDetails2);
//------String functions--------------
console.log('Char At: ' + employeeName.charAt(0)); // returns 'e'
console.log('Lower Case: ' + employeeName.toLowerCase()); // returns 'e
//concat
console.log('Concate : ' + employeeName.concat(employeeDept));
console.log('IndexOf: ' + employeeName.indexOf('A')); // IndexOf: 0
console.log('IndexOf: ' + employeeName.indexOf('M')); //IndexOf: -1
console.log('IndexOf: ' + employeeName.indexOf('l')); // IndexOf: 1
var employeees = 'Alex, Max, Rock, Chilli';
console.log('Split by ,:' + employeees.split(',')); // Split by ,:Alex, Max, Rock, Chilli
console.log('Split by ,:' + employeees.split(',', 2)); // Split by ,:Alex, Max
//----------Boolean----------
var isEmployee = true;
console.log("Is employee: " + isEmployee);
//------Arrays ----------
//---Using square brackets
var departments = ['Hr', 'Finanace', 'Sales'];
console.log('List of Departments: ' + departments);
//---Using Generic Type
var depts = ['Hr', 'Finanace', 'Sales'];
console.log('List of Depts: ' + depts);
//---Declaration adn Definition
var city;
city = ['Pune', 'Calcutta', 'Mumbai'];
//-----MultiType Array
var days = ['Monday', 2, 'Tuesday', 4];
console.log(days);
var month = ['Jan', 2, 3, 'Feb', 5];
console.log(month);
//-----------------------Any--------------------
var suspense = "Hello World!";
console.log(suspense);
suspense = true;
console.log(suspense);
//Tuple
// A tuple is a typed array with a pre-defined length and types for each index.
// Tuples are great because they allow each element in the array to be a known type of value.
var person = [1, "Alex", true];
console.log(person);
person.push(2, "Gini", true);
console.log("Added Person: " + person);
var employee;
employee = [[1, "Alex"], [2, "Max"], [3, "Joe"]];
console.log(employee);
console.log(" First Employee: " + employee[1]);
var x = 10, y = 20;
if (x > y) {
    console.log('x is greater than y.');
}
else if (x < y) {
    console.log('x is less than y.'); //This will be executed
}
else if (x == y) {
    console.log('x is equal to y');
}
//------------
var x1 = 10, y1 = 20;
x1 > y1 ? console.log('x1 is greater than y1.') : console.log('x1 is less than or equal to y1.');
