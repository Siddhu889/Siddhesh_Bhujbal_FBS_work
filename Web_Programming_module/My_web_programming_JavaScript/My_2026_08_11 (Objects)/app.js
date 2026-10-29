// //objects
// const student = {
//     name : "Siddhesh",
//     age: 23,
//     marks: 94.4,
//     city: "Delhi"
// };

//Functions
function printPoem()
{
    console.log("Twinkle Twinkel , little star");
    console.log("how I would what you are");
}

//printPoem();

function rollDice()
{
    let rand = Math.floor(Math.random() * 6) + 1;
    console.log(rand);
}

rollDice();
rollDice();
rollDice();
rollDice();
rollDice();

function sum(a, b)
{
    console.log(a+b);
}

sum(1,2);
sum(3,9);
sum(4,0);

//function to cal avg

function calcAvg(a, b, c)
{
    let avg = (a+b+c)/3;
    console.log(avg);
}

calcAvg(2, 4, 6);

//return
function sum(a,b)
{
    return a+b;
}