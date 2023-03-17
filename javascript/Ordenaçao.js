var input = require('fs').readFileSync('javascript/stdin', 'utf8');
//ESTUDAR
var sep = [' ', '\n'];
var line = input.split(new RegExp(sep.join('|'), 'g'));


    function particao(a, baixo, alto) {
        let pivo = a[alto];
        let i = (baixo - 1);
        for (let j = baixo; j < alto; j++) {
            if (a[j] < pivo) {
                i++;
                let temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        let temp = a[i + 1];
        a[i + 1] = a[alto];
        a[alto] = temp;

        return i + 1;
    }

    function quicksort(a, baixo, alto) {
        if (baixo < alto) {
            let parte = particao(a, baixo, alto);
            quicksort(a, baixo, parte - 1);
            quicksort(a, parte + 1, alto);
        }
    }

    function ordenacao() {
        let a;
        let i;
        console.log("Entrada do tamanho da lista:");
        let tamanho = parseInt(line.shift());
        console.log(tamanho);
        a = new Array();
        console.log();
        

        console.log("Entrada dos elementos da lista: ");
        for (i = 0; i < tamanho; i++) {
            a[i] = parseInt(line.shift());
            //console.log(a[i]);
        }
        console.log(a + " ");
        console.log();

        quicksort(a, 0, tamanho - 1);

        console.log("A ordenaçao dos elementos eh: ");
        for (i = 0; i < tamanho; i++) {
            //console.log(a[i] + " ");
        }
        console.log(a + " ");
    }

ordenacao();