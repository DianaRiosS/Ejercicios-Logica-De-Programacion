let numberInput1 = prompt("Ingresa el primer numero: ");
let number1 = parseInt(numberInput1);
let numberInput2 = prompt("Ingresa el segundo numero: ");
let number2 = parseInt(numberInput2);
let numberInput3 = prompt("Ingresa el tercer numero: ");
let number3 = parseInt(numberInput3);

if(number1 == number2 && number1 == number3){
    console.log("Los numeros son iguales");
}else if(number1 >= number2 && number1 >= number3){
    if(number2 >= number3){
        console.log("Los nuemros ordenados de mayor a menor");
        console.log(number1 + ", " + number2 + ", " + number3);
        console.log("Los nuemros ordenados de menor a mayor");
        console.log(number3 + ", " +  number2 + ", " + number1);
    }else{
        console.log("Los nuemros ordenados de mayor a menor");
        console.log(number1 + ", " + number3 + ", " + number2);
        console.log("Los nuemros ordenados de menor a mayor");
        console.log(number3 + ", " + number3 + ", " + number1);
    }
}else if(number2 >= number1 && number2 >= number3){
    if(number1 >= number3){
        console.log("Los nuemros ordenados de mayor a menor");
        console.log(number2 + ", " + number1 + ", " + number3);
        console.log("Los nuemros ordenados de menor a mayor");
        console.log(number3 + ", " + number1 + ", " + number2);
    }else{
        console.log("Los nuemros ordenados de mayor a menor");
        console.log(number2 + ", " + number3 + ", " + number1);
        console.log("Los nuemros ordenados de menor a mayor");
        console.log(number1 + ", " + number3 + ", " + number2);
    }
}else {
    if(number1 >= number2){
        console.log("Los nuemros ordenados de mayor a menor");
        console.log(number3 + ", " + number1 + ", " + number2);
        console.log("Los nuemros ordenados de menor a mayor");
        console.log(number2 + ", " + number1 + ", " + number3);
    }else{
        console.log("Los nuemros ordenados de mayor a menor")
        console.log(number3 + ", " + number2 + ", " + number1);
        console.log(number1 + ", " + number2 + ", " + number3);
    }
}