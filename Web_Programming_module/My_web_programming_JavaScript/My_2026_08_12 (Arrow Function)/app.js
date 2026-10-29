const student = {
    name: "aman",
    marks: 95,
    prop: this, //global scope
    getName: function()
    {
        console.log(this);
        return this.name;
    },
    getMarks: () => {
        console.log(this);  //parent's scope -> window
        return this.marks;
    },
    getInfo1: function()
    {
        setTimeout( () => {
            console.log("this");  //student object
        }, 2000);
    },
    getInfo2: function()
    {
        setTimeout( function () 
        {
            console.log("this");  //window object
        },2000);
    } // Normal function gets this from how it is called. 
     // Arrow function gets this from where it was created.

};

//Practice Qs
//write an arrow function that returns the square of a number 'n'.
//write a function that prints "Hello World" 5 times at intervals of 2s each.

const square = (n) =>  n * n;

console.log(square(4));


setInterval(() => {
    console.log("Hello World");
},2000);

setTimeout(() => {
    clearInterval(id);
    console.log("clear interval ran");
},10000);