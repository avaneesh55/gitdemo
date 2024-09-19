
//------Arrays ----------
//---Using square brackets
let departments: string[] = ['Hr', 'Finanace', 'Sales'];
console.log('List of Departments: '+departments);


//---Using Generic Type
let depts: Array<string> = ['Hr', 'Finanace', 'Sales'];
console.log('List of Depts: '+depts);



//---Declaration adn Definition
let city: Array<string>;
city = ['Pune','Calcutta','Mumbai'];



//-----MultiType Array
let days : (string | number)[]= ['Monday',2,'Tuesday',4];
console.log(days);

let month : Array <string | number>= ['Jan',2,3,'Feb',5];
console.log(month);

