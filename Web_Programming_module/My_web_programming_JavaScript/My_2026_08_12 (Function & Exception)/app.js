let sum = 54; //Global Scope

function calSum(a, b)
{
    let sum = a+b; //Function Scope is more specific
    console.log(sum);
}

calSum(1,2);
console.log(sum);

//High Order Function (factory function)

function oddOrEvenFactory(request)
{
    if(request == "odd")
    {
        let odd = function(n)
        {
            console.log(!(n%2 == 0));
        }

        return odd;
    }

    else if(request == "even")
    {
        let even = function(n)
        {
            console.log(n%2 == 0);
        }

        return even;
    }

    else 
    {
        console.log("wrong request");
    }
}

let request = "odd"; //even

//try catch exception

console.log("hello");
console.log("hello");
//let a = 5;
try{
    console.log(a);
}
catch{
    console.log("caught an error... a is not defined");
    console.log(err);
}

console.log("hello2");
console.log("hello2");

//arrow functions

const sum = (a, b) => {
    console.log(a + b);
};

const pow = (a , b) =>{
    return a ** b;
}

const hello = () => {
    console.log("hello world");
};

const mul = (a, b) => a * b;