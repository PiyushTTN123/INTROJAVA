let emp = [
  {
    name: "Piyush",
    age: 23,
    salary: 1000,
    DOB: "12/12/2012",
  },
  {
    name: "Harsh",
    age: 10,
    salary: 5000,
    DOB: "11/02/2015",
  },
  {
    name: "Kapil",
    age: 24,
    salary: 300,
    DOB: "10/03/2002",
  },
  {
    name: "Tushar",
    age: 20,
    salary: 69000,
    DOB: "19/10/2012",
  },
  {
    name: "sourav",
    age: 18,
    salary: 130000,
    DOB: "26/08/2018",
  },
  {
    name: "Abhijeet",
    age: 21,
    salary: 800,
    DOB: "02/02/2002",
  },
];
console.log("1.Employee list:");
console.log(emp);
const value = emp.filter((items) => items.salary > 5000);
const groupBelow_18 = emp.filter((items) => items.age <= 18);
const groupAbove_18 = emp.filter((items) => items.age > 18);
console.log("2.Employees SAlary>5000");
console.log(value);
console.log("3.1Group of employees less than 18");
console.log(groupBelow_18);
console.log("3.2Group of employees greater than 18");
console.log(groupAbove_18);
console.log("4.Salary<1000 and age>20");
const EmpSalary = emp.reduce((acc, items) => {
  if (items.salary < 1000 && items.age > 20) {
    items.salary *= 5;
    acc.push(items);
  }
  return acc;
}, new Array());
console.log(EmpSalary);
