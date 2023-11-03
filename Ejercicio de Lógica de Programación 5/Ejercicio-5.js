let numero, Array = [];
const numeroSecreto = Math.floor(Math.random() * 100) + 1;
let adivinado = false;

function ingresaNumero() {
    do {
        numero = parseInt(prompt("Ingresa un número (del 1 - 100): "));
        console.log(numero);
        if (isNaN(numero) || numero > 100 || numero < 1) {
            alert("Valor inválido");
        } else {
            Array.push(numero);
            break;
        }
    } while (isNaN(numero) || numero > 100  || numero < 1);
}

do {
    if (adivinado) {
        alert("Ups, el número secreto es incorrecto, vuelve a intentarlo.");
    }
    console.log(`El número secreto es: ${numeroSecreto}`);
    ingresaNumero();
    adivinado = true; // Cambia el valor a 'true' después de la primera iteración.
} while (numero != numeroSecreto);

alert("Felicidades, adivinaste el número secreto.");
alert(`Los números anteriores ingresados fueron: ${Array}`);