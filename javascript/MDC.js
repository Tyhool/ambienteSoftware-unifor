var input = require('fs').readFileSync('javascript/stdin', 'utf8');
//ESTUDAR
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));

let a = 0, b = 0, resto = 0;

console.log("Primeiro numero");
a = parseInt(line.shift());
console.log(a)
console.log("Segundo numero");
b = parseInt(line.shift());
console.log(b)

while (b != 0) {
    resto = a % b;
    a = b;
    b = resto;
}
console.log("O MDC eh: " + a);