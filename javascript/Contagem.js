
var input = require('fs').readFileSync('javascript/stdin', 'utf8');
//ESTUDAR
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));

console.log("Informe a quantidade de elementos:");
let n = parseInt(line.shift());
console.log(n);
let valor;
let contadorInt = 0;
let contadorFlo = 0.0;
let i = 0;

while(i < n){
    valor = line.shift();

    if(valor % 1 === 0 ){
        contadorInt = contadorInt + 1;
    }else{
        contadorFlo = contadorFlo + 1;
    }
    i = i + 1;
}

console.log("Numeros que são inteiros são: " + contadorInt);
console.log("Numeros que não são inteiros são: " + contadorFlo);