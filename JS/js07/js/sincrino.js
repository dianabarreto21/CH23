//Javascript sincrono
alert("feliz dia del michi")
console.log("Hola, buen día");
alert("No es dia de perrito");
console.log("adios");


//mecanismo asíncrono
setTimeout(
    function () { //esta funcion asincrona hace un callback con timer
        console.log("Hola mundo con retraso");
    }, 5000)
setTimeout(
    function () { //esta funcion asincrona hace un callback con timer
        console.log("Hola mundo con retraso 2");
    }, 1000)
console.log("sorpresa");

//mecanismo asíncrono con funcion flecha
const myCallback = () => console.log("hola mundo atrasado");
setTimeout(myCallback);
console.log("sorpresa");
