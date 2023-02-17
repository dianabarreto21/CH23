// VARIABLE
let miVariable = 5;

// ARREGLO unidimensional
// almacena mas información que una variable, un arreglo tiene dimensión y se encuentra dentro de []
let miArray = [2, 3, 4, 5, 6]; //<--- el arreglo 5 casillas
//            [0, 1, 2, 3, 4]  <--- el indice son 4

console.log(miArray[0]); //<-- Se imprime el 2

// ARREGLO bidimensional
// let miArray1 = [
//     [1, 2, 3], // [0]->[0, 1, 2]
//     [4, 5, 6], // [1]->[0, 1, 2]
//     [7, 8, 9]  // [2]->[0, 1, 2]
// ]

console.log(miarray1[0][1]); //<-- Se imprime el 2
console.log("todo el indice: " + miArray1[0]); //<--se imprime 1,2,3
console.log("todo el indice: " + miArray1[1]); //<--se imprime 4,5,6
console.log("todo el indice: " + miArray1[2]); //<--se imprime 7,8,9

/* ----- Ciclo For ----- */
// El bucle For se utiliza para iterar a traves de una secuencia/matriz de tipos de datos u objetos. Su ejecuciondepende de una condición booleana (v o f) 
for (let i = 0; i < 10; i++) {
    console.log("imprimiendo i -> " + i);
}
for (let i = 0; i <= 5; i++) {
    console.log("imprimiendo miArray -> " + miArray[i]);
}

/*
let miArray1 = [
    [1, 2, 3], // [0]->[0, 1, 2]
    [4, 5, 6], // [1]->[0, 1, 2]
    [7, 8, 9]  // [2]->[0, 1, 2]
] 
*/

for (let i = 0; i < 3; i++) {
    for (let j = 1; j < 3; j++) {
        console.log("imprimiendo la matriz1 -> " + miArray1[i][j]);
    }
    console.log("*******************")
}

/***************** */

let miArray1 = [
    [1, 2, 3], // [0]->[0, 1, 2]
    [4, 5, 6], // [1]->[0, 1, 2]
    [7, 8, 9]  // [2]->[0, 1, 2]
]

let matrizR = [
    [], [], []
]
for (let i = 0; i < 3; i++) {
    for (let j = 0; j < 3; j++) {
        matrizR[i][j] = miArray1[i][j] * miArray1[i][j];
    }
}

console.log(matrizR);


/************bucle while************/

while(condicion){ //se ejecuta mientras se cumpla una condicion

}

let contador = 0
while(contador < 10){
    console.log(contador);
    contador++;
}



