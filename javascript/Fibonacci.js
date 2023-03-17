var input = require('fs').readFileSync('javascript/stdin', 'utf8');
//ESTUDAR
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));

let number = parseInt(line.shift());
let result = ""
let temp = 1;
let sum = 0;
let back = 0;

for(let i = 0; i < number; i++){
    if(i == 0 || i == 1){
        result += `${i} `;
    }

    else{
        sum = temp + back;
        back = temp;
        temp = sum;
        if(i == 2){
            result += `${sum}`;

        }
        else{
            result += ` ${sum}`;
        }
    }
}

console.log(result);