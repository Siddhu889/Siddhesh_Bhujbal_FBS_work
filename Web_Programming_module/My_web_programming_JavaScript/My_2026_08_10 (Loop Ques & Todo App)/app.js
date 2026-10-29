//Practice question
// const favMovie = "avatar";

// let guess = prompt("guess my favorite movie");

// while(guess != favMovie) 
// {
//     if(guess == "quit"){
//     console.log("you quit");
//     break;
// }
// guess = promt("wrong guess. please try again");
// }

// if(guess == favMovie)
// {
//     console.log("congrats!!");
// }

//todo app in array

let todo = [];

let req = prompt("please enter your request");

while(true)
{
    if(req == "quit")
    {
        console.log("quitting app");
        break;
    }

    if(req == "List")
    {
        console.log("-------------");
        for(let i=0; i<todo.length;i++)
        {
            console.log(i, todo[i]);
        }
        console.log("-------------");
    }

    else if(req == "add")
    {
        let task = prompt("please enter the task you want to add");
        todo.push(task);
        console.log("task added");
    }

    else if(req == "delete")
    {
        let idx = prompt("please enter the task index");
        todo.splice(idx, 1);
        console.log("task deleted");
    }
    
    else{
        console.log("unvalid request");
    }

    req = prompt("please enter your request");
}