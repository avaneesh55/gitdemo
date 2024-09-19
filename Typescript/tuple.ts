
//Tuple

// A tuple is a typed array with a pre-defined length and types for each index.
// Tuples are great because they allow each element in the array to be a known type of value.


var person: [number, string, boolean] = [1, "Alex", true];
console.log(person);
 
person.push( 2, "Gini",true);
console.log("Added Person: "+ person);
 
var employee: [number, string][];
employee = [[1, "Alex"], [2, "Max"], [3, "Joe"]];
console.log(employee);
console.log(" First Employee: " + employee[1]);