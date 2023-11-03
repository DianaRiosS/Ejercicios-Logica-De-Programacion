let numero;
do {
    numero = parseInt(prompt("Ingrese un numero:"));
    if(isNaN(numero)){
        alert("Valor invalido");
    }else{
        break;
    }
} while (isNaN(numero));

let factorial = 1;
for(let i = 2; i<=numero; i++){
    factorial = i * factorial;
}
console.log("El factorial del numero es: " + factorial);