let helloWorld = "Hello World";
console.log(helloWorld);

let employeeName:string = 'Alex';
console.log(employeeName);
 
let employeeDept:string = 'HR';
console.log(employeeDept);

//ES5
let AlexDetails1: string = employeeName + " works in the " + employeeDept + " department.";

console.log(AlexDetails1);

// //Es6
// let AlexDetails2 : string = ${employeeName} works in the ${employeeDept} department.;
// console.log(AlexDetails2);


//------String functions--------------
console.log('Char At: '+ employeeName.charAt(0)); // returns 'e'
console.log('Lower Case: '+ employeeName.toLowerCase()); // returns 'e


//concat
console.log('Concate : '+ employeeName.concat(employeeDept));
console.log('IndexOf: '+ employeeName.indexOf('A'));// IndexOf: 0
console.log('IndexOf: '+ employeeName.indexOf('M')); //IndexOf: -1
console.log('IndexOf: '+ employeeName.indexOf('l'));// IndexOf: 1



let employeees : string = 'Alex, Max, Rock, Chilli';
console.log('Split by ,:'+ employeees.split(','));// Split by ,:Alex, Max, Rock, Chilli
console.log('Split by ,:'+ employeees.split(',',2)); // Split by ,:Alex, Max


//----------Boolean----------
let isEmployee:boolean=  true;
console.log("Is employee: "+isEmployee);

//-----------------------Any--------------------
let suspense: any = "Hello World!";
console.log(suspense);
suspense= true;
console.log(suspense);
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