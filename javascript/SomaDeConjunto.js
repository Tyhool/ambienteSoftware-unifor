var input = require('fs').readFileSync('javascript/stdin', 'utf8');
//ESTUDAR
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));

let n, num, soma = 0, i = 0;

console.log("Quantos numeros a serem somados:");
n = parseInt(line.shift());
console.log(n);

while (i < n) {
    i = i + 1;
    console.log("Entre com o " + i + " numero");
    num = parseInt(line.shift());
    console.log(num);
    soma = soma + num;
}
console.log("A soma da: " + soma);
    
