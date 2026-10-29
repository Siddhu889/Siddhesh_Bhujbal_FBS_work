// let students = [
// {
//     name: "aman",
//     marks: 95,
// },
// {
//     name: "shradha",
//     marks: 94.4,
// },
// {
//     name: "rajat",
//     marks: 92,
// },
// ];

// // arr.forEach((student) => {
// //     console.log(student.marks);
// // }); 

// //Map and filter
// let gpa = students.map((el) => {
//     return el.marks / 10;
// })

// let nums = [1, 2, 3, 4, 5, 7, 8, 2, 9, 10, 11, 12];
// let ans = nums.filter((el) => {
//     return el %  2 == 0; //even -> true
// });


//Reduce method
// let arr = [2, 4, 7, 10, 45, 6, 34, 23, 44, 71, 82, 9];

// let max = arr.reduce( (max, el) =>{
//     if(max > el)
//     {
//         return el;
//     }
//     else{
//         return max;
//     }
// });

// //practice qs check if all numbers in our array are multiples of 10 or not.

// let nums = [10, 20, 30, 40, 3];

// let ans = nums.every((el) => el % 10 == 0);

// console.log(ans);

// //Spread (Object Literals)
// const data = {
//     email: "ironman@345gmail.com",
//     password: "aff443",
// };

// const dataCopy = {...data, id: 123, country: "India"};

// let arr = [1, 2, 3, 4, 5]; //val
// let obj1 = {...arr}; //obj -> key:val

// let obj2 = {..."hello"};


//destructuring (Objects)

const student = {
    name : "karan",
    age : 23,
    class : 9,
    subjects : ["hindi","english","math","science"],
    username : "karan@123",
    password : "abcd",
    city : "Pune",
};

let { username: user, password: secret, city = "Mumbai"} = student;

