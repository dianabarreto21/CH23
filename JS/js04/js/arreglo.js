let lista = [12,5,80,34,90,76];
let listaNueva = lista.slice(1,3); // te muestra los numeros entre 1 y 3 sinmostra el ultimo
let msj =lista.join("-"); //añade un caracter a la lista

let lista1 = [23,43,28,55,34,87]
lista1.push(100,200); //te agrega el elemento al final de la lista
console.log(lista1);

console.log(msj);

console.log(listaNueva);

console.log(lista.length); //te dice el nulero de elementos de la list
for(let i = 0; i < lista.length; i++) {
    console.log("-->" + lista[i]);
    }
console.log(lista);

let lista2 = [23,34,76,87];
let masE = lista2.concat(100,200,300);//agrega mas elementos
console.log(masE);

let lista4 = [32,56,36,85,45];
lista4.pop(); // Quita el ultimo elemento de la lista
console.log(lista4);

let lista5 = [31,56,36,85,45];
lista5.shift(); //Quita el pimer elemento de la lista
console.log(lista5);

let lista6 = [31,56,36,85,45];
let remover = lista6.splice(0,4) //remueve los elementos dentro del index
console.log(remover);
console.log(lista6);

let lista7 = [31,56,36,85,45];
lista7.splice(2,0,100,200) //agrega los elementos, 2 es la posicion 0 los elementos a remover
console.log(lista7);

let lista8 = [31,56,36,85,45];
lista8.reverse(); // acomoda los elementos al reves
console.log(lista8);

let lista9 = [61,56,36,5,45];
lista9.sort(); //ordena en orden del primer numero o letra del elemento
console.log(lista9);

let lista10 = [71,56,36,5,45];
lista10.sort(  //ordena los valores de menor a mayor
    function(valor1, valor2) {
        return valor1 - valor2;
    } 
);
console.log(lista10);

let lista11 = [71,56,36,5,45];
lista11.sort(  //ordena los valores de mayor a menor
    function(valor1, valor2) {
        return valor2 - valor1;
    } 
);
console.log(lista11);

let lista12 = [71,56,36,5,45];
let lista13 = lista12.map(  //toma los valores y los opera en este caso *2
    function(valor) {
        return valor * 2;
    }
);
console.log(lista13);