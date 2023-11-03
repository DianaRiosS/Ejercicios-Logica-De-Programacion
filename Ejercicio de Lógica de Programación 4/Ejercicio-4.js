let number;
do {
    number = parseInt(prompt("Ingrese un numero: "));
    if(isNaN(number)){
        alert("Valor invalido");
    }else{
        break;
    }
} while (isNaN(number));


let arrayNumber = [0,1];
let fibonacci;
for(let i = 2; i <number; i++){
    fibonacci = arrayNumber[i-2] + arrayNumber[i-1];
    arrayNumber.push(fibonacci);
}
console.log(arrayNumber);