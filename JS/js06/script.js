
/*
Que encontramos en el arbol del DOM?

- Node: es la unidad más basica dentro del documento. Puede ser una etiqueta, un texto dentro de una etiquieta o un comentario, etc.

    <title> NODO
    Manipulacion DOM //Es un nodo, pero es hijo del title
    </title>

    Tipos de nodos
- Document: Tambien es un nodo, del tipo documento es el nodo raiz a partir del cualsedesarrollan o generan todos los demas nodos.

- Element: son todos aquiellos definidos por etiquetas: <div>, <img>, <h1>, <h2>, etc.

- Attributes: Nodos que dan la información asociada al tipo de elemento: srs, href, style,

- Comentario: Comentarios y otros elementos que están dentro del HTML, son considerados nodos
*/

/*Como leer nodos de mi Document object Model (DOM)

Metodos tradicionales (que se usan en versiones antiguas de JS)
- document.getElementById (botonSuma)
- document.getElementsByTagName (<button>)
- document.getElementsByClassName (class=botones)

*/
/*
var elementoId = document.getElementById("botSuma");
console.log(elementoId);

var elementoEtiqueta = document.getElementsByTagName("button");
console.log(elementoEtiqueta);
console.log("este es el primer elemento d emi coleccion de botones", elementoEtiqueta[0]);

var elementoClass = document.getElementsByClassName("botones");
console.log(elementoClass);

/*

Metodos recientes
    -document.querySelector ("#botSuma")
    -document.querySelectorAll (".botones")
    
    */
// Creacion de nodos
//document.createElement("tiponodo");
// creacion de etiqueta de tipo imagen
var imagenPerrito = document.createElement("img");

// creamos atributos a la etiqueta

imagenPerrito.src= "https://www.petdarling.com/wp-content/uploads/2021/01/cachorros.jpg"
imagenPerrito.alt = "Foto de perrito"
imagenPerrito.style.width = "150px";
imagenPerrito.style.borderRadius = "50px";
//Poner elementos o nodos en el html
document.body.append(imagenPerrito);

var textoPerrito = document.createElement("p");
textoPerrito = "Este es mi perrito";



/*
var unElemento = document.querySelector("#input1");
console.log(unElemento);

var variosElementos = document.querySelectorAll(".botones");
*/
// Construir nuestra calculadora
var input1 = document.getElementById("input1")
var input2 = document.getElementById("input2")

var botSuma = document.getElementById("botSuma");
var botResta = document.getElementById("botResta");
var botMulti = document.getElementById("botMulti");
var botDiv = document.getElementById("botDiv");

var resultado = document.getElementById("resultado");

//Actualizar nodos
//Identificar el nodocon un metodo para tomarlo (getElement o querySelector)

var resultadoCambiante = document.getElementById("resultado");

function suma(){
    let valor1 = parseInt(input1.value); //pido numer 1
    let valor2 = parseInt(input2.value);//pido numer 2
    let suma = valor1+valor2; //calculo la suma
    resultado.innerHTML = suma;//pongo el resultado en su lugar
}
/*Como se crea un evento (addEventListener)

    - node.addEventListener ("evento a escuchar, lo que quiero que haga")
*/

botSuma.addEventListener("click", suma);

function resta(){
    let resta1 = parseInt(input1.value);
    let resta2 = parseInt(input2.value);
    let resta = resta1-resta2;
    resultado.innerHTML = resta;
}
botResta.addEventListener("click", resta);

function multi(){
    let multi1 = parseInt(input1.value);
    let multi2 = parseInt(input2.value);
    let multi = multi1*multi2;
    resultado.innerHTML = multi;
}
botMulti.addEventListener("click", multi);

function div(){
    let div1 = parseInt(input1.value);
    let div2 = parseInt(input2.value);
    let div = div1/div2;
    resultado.innerHTML = div;
}
botDiv.addEventListener("click", div);

/*
Manipulación del DOM

- Metodos para acceder a elementos
    - document.getElementById
    - document.getElementsByTagName
    - document.getElementsByClassName

- Metodos para crear elementos
    - document.createElement(etiqueta)
    - document.createTextNode(texto)

- Metodos para insertar elementos
    - parentElement.append
    - parentElement.insertBefore    
    - parentElement.insertAdjacentElement

- Metodos para modificar elementos
    node.outerHTML (leer o referenciar el elemento)
    node.innerHTML (Modificar el elemento)
*/

//creo funcion que cambia de color segun el paramtro modo cutre
/*
var textoAModificar = document.querySelector("#h1")
function cambiarColor(color){
    textoAModificar.style.color= color;
}

*/
















