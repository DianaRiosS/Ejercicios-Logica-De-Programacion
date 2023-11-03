let Celcius;
do {
    let verificacion1 = prompt("Ingresa la temperatura en grados Celcius");
    Celcius = parseInt(verificacion1);
    if (isNaN(Celcius)) {
        alert("Valor no valido");
    }else{
        break;
    }
} while (isNaN(Celcius));

console.log(Celcius);

let Farenheit = ((Celcius * 9/5) + 32);
let Kelvin = (Celcius + 273.15);

console.log(`Grados Fahrenheit: ${Farenheit}`);
console.log(`Grados Kelvin: ${Kelvin}`);