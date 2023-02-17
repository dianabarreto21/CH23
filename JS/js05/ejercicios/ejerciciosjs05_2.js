let GPAacumulativo = 2.1
let Unidadestotales = 120

if (GPAacumulativo > 2.0 && Unidadestotales >= 120) {
    console.log("Puede graduarse")
}


////////////////////////////////

let cspCalificacion = 65
let progCalificacion = 65
if (cspCalificacion >= 75 || progCalificacion >= 75) {
    console.log("Eres elegible para la graduación")
}

////////////////////////////////

let texto = "Hola Mundo";
let punto = "";
for (let i = 0; i <texto.length; i++){
    punto += texto[i] +".";
}
//console.log(punto);
let textoEspacio = punto.split(" ");

console.log(textoEspacio[0].substring(0,7)+ " " + textoEspacio[1].substring(1,10));





////////////////////////////////
let text = "Hola Mundo";

let message = [];

for (let index = 0; index < text.length; index++){

    message += text[index] + ".";
}
let partMessage1 = message.substring(0,7);
let partMessage2 = message.substring(10,19);
console.log(partMessage1 + " " + partMessage2);