// if (condition) {
//     Bloque código
// }

let edad = parseInt (prompt("Escribe tu edad"));

if (edad >= 18){
    document.write("eres mayor de edad");
} else {
    document.write("<h2> no eres mayor de edad</h2>");
}

if (edad <= 17){
    document.write("<h2>Tas quiquito</h2>");
} else if(edad === 18){
    document.write("<h2>Eres mayor de edad</h2>")
}

else if (edad > 18){
    document.write("<h2>Tas ruco</h2>");
} else {
    document.write("<h2>este no es un numero valido</h2>")
}
