var helloWorld = "Hello World";
console.log(helloWorld);
var employeeName = 'Alex';
console.log(employeeName);
var employeeDept = 'HR';
console.log(employeeDept);
var AlexDetails1 = employeeName + " works in the " + employeeDept + " department.";
console.log(AlexDetails1);
var AlexDetails2 = "".concat(employeeName, " works in the ").concat(employeeDept, " department.");
console.log(AlexDetails2);
var user;
user = "Shaitesh";
console.log(typeof user);
console.log(user);
console.log(user.toUpperCase());
var num1 = 123;
var num2 = 23453;
function myfun(num1, num2) {
    var num = num1 + num2;
    return num;
}
console.log(myfun(num1, num2));
var user1 = "Shailesh";
var user2 = "avaneesh@123";
var array = [12, 14, 18, 20, 10];
console.log(array);
console.log(typeof array);
console.log(array[2]);
array.forEach(function (l) {
    console.log(l);
});
var friends = ["Shailesh", "Ramesh", "Mohan", "Jeetu"];
console.log(friends.toString());
var newarray = friends.map(function (value) {
    if (value == "Ramesh") {
        return value.toLowerCase();
    }
    else {
        return value.toUpperCase();
    }
    console.log(value);
});
console.log(newarray);
var new1 = friends.forEach(function (value) {
    console.log(value);
    return value.toUpperCase["shailesh"];
});
console.log(new1);
