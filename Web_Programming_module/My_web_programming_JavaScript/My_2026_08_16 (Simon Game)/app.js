let gameSeq = [];
let userSeq = [];

let btns = ["yellow", "purple", "green", "red"];

let started = false;
let level = 0;

let h2 = document.querySelector("h2");

document.addEventListener("keypress", function() {
    if(started == false) {
        console.log("game is started");
        started = true;

        levelUp();
    }
});

function gameFlash(btn) {
    btn.classList.add("flash");

    setTimeout(function () {
        btn.classList.remove("flash");
    }, 250);
}

function userFlash(btn) {
    btn.classList.add("userflash");

    setTimeout(function () {
        btn.classList.remove("userflash");
    }, 250);
}

function levelUp() {

    userSeq = [];
    level++;
    h2.innerText = `Level ${level}`;

    let randIdx = Math.floor(Math.random() * btns.length);
    let randColor = btns[randIdx];
    let randBtn = document.querySelector(`.${randColor}`);

    gameSeq.push(randColor);
    console.log("Game Sequence:", gameSeq);
    gameFlash(randBtn);
}

function checkAns(idx) {

    console.log("Checking:", userSeq[idx], gameSeq[idx]);

    if(userSeq[idx] === gameSeq[idx]) {

        if(userSeq.length == gameSeq.length) {
            setTimeout(levelUp, 1000);
        }

    } else {

        h2.innerText = `Game Over! Your score was <b>${level}</br> <br> Press any key to start.`;

        reset();
    }
}

function btnPress() {

    let btn = this;

    userFlash(btn);

    let userColor = btn.getAttribute("id");

    userSeq.push(userColor);

    console.log("User Sequence:", userSeq);
    console.log("Game Sequence:", gameSeq);

    checkAns(userSeq.length - 1);
}

let allBtns = document.querySelectorAll(".btn");

for(let btn of allBtns) {
    btn.addEventListener("click", btnPress);
}

function reset() {

    started = false;

    gameSeq = [];

    userSeq = [];

    level = 0;
}