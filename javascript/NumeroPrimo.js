var input = require('fs').readFileSync('javascript/stdin', 'utf8');
//ESTUDAR
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));

console.log("Digite um numero:")
let primo = parseInt(line.shift());
console.log(primo)
cont = 0;
   

for(let j = 2; j < primo; j++){
    if(primo % j == 0){
        cont++;
    }

}

if(cont > 0){
    console.log(`${parseInt(primo)} nao eh primo`);
}
else{
    console.log(`${parseInt(primo)} eh primo`);
}