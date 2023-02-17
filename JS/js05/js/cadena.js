let texto = "hola Mundo";
let mensaje = "El texto tiene " + texto.length + " caracteres"; //la variable se permite trabajar como objeto con la funcion length
console.log(mensaje);

////////////////////////////////
let texto2 = "hola Mundo";
let mensaje2 = " ";
for (let i = 0; i < texto2.length; i++) { // Se manipula la variable como string y objeto
    mensaje2 += texto2[i] + " "; // el proceso es ponerle espacio entre caracteres
}
mensaje2 = mensaje2.trim() // elimina espacios al inicio y al final de una cadena de caracteres
console.log(mensaje2);

////////////////////////////////

let texto3 = "hola Mundo";
let mensaje3 = texto3.toUpperCase(); //Convertir a uppercase
console.log(mensaje3);

////////////////////////////////

let texto4 = "holaMundo";
let palabra = texto4.substr(5,7); //te muestra los caracteres dentro de ese rango
console.log(palabra);

////////////////////////////////

let texto5 = "holaMundo";
let palabra2 = texto5.substring(5,7); //
console.log(palabra2);

////////////////////////////////

let texto6 = "hola Mundo";
let palabra3 = texto6.split(" "); //lo divide donde está el espacio
console.log(palabra3[0] + "/" +palabra3[1]);//imprime la palabra en el indice0 despues la diagonal entrelas palabras divididas palabra en indice2

////////////////////////////////

let texto7 = "hola Mundo";
if (texto7.includes("l")) {
    console.log("este caracter si está en el texto");
    console.log(texto7.includes("hola"));// otra forma de imprimir, te da true/false
} else{
    console.log("este caracter no está en el texto");
}

////////////////////////////////
