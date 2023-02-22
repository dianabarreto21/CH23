//objeto es declarado como una variable, pero tiene una estructorua(estructura de datos)
let persona = { 
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto: function(){
        return 'el nombre es ' +  this.nombre + ' ' + this.apellido; //this. refiere a los atributos del objeto
    }
}
console.log(persona.nombreCompleto); //se llama al objeto 

console.log(persona);
console.log(persona.nombre);