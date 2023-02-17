/***** Ejercicio 1 */
let personas = ["Sofía", "David", "Juan"];

personas.push("Sara", "Agustin");

let firstPerson = personas.shift();
console.log("Persona llamada: " + firstPerson);
console.log("Fila: " + personas);

personas.splice(1, 0, "Renata")
personas.push("Elena")
console.log("Fila: " + personas);

/***** Ejercicio 2 */

let asterisco = "*";
for (let i = 0; i < 5; i++) {
    console.log(asterisco);
    asterisco += "*";
}

for (let i = 1; i <= 5; i++) {
    let simbolo = '*';
    for (let j = 1; j <= i; j++) {
        simbolo += '*';
    }
    console.log(simbolo);
}

/***** Ejercicio 3 */
let xValue = 10;
while (xValue > 0) {
    console.log(xValue);
    xValue -= 0.5;
}
//Print all the odd numbers between 1 - 100.
for (let i = 1; i <= 100; i++) {
    if (i % 2 != 0) {
        console.log(i);
    }
}


for (let i = 1; i <= 100; i++) {
    if (i % 2 != 0) { //Si el resto de la división es distinto de 0, es impar
        console.log(i);
    }
}