class Persona {
    constructor(nombre, apellidos) {// EL constructor te da memoria para los atributos
        this.nombre1 = nombre;
        this.apellidos1 = apellidos;
    }
}
let persona1 = new Persona('Diana', 'Barreto Rojas');
console.log(persona1.nombre1);

let persona2 = new Persona('Monica', 'Pruneda');
console.log(persona2.apellidos1);

/****** Metodos de acceso Get y set *******/


class Persona2 {
    constructor(nombre, apellidos) {// EL constructor te da memoria para los atributos
        this._nombre2 = nombre;
        this._apellidos2 = apellidos;
    }
    set nombre2(nombre) {
        this._nombre2 = nombre;
    }
    get nombre2() {
        return this._nombre2;
    }
    set apellidos2(apellidos) {
        this._apellidos2 = apellidos;
    }
    get apellidos2(){
        return this._apellidos2;
    }
    nombreCompleto(){
        return this._nombre2 + ' ' + this._apellidos2;
    }
    //Sobreescribir el metodo de la clase Padre Object
    toString(){
        return this.nombreCompleto();
    }
}

//let personados = new Persona2('Mary', 'Jane'); //Este objeto no va antes del class (hoisting)
//personados.nombre2 = 'Maria';//Redefiniendo el nombre
//console.log(personados.nombre2);
//console.log(personados.apellidos2);

class Empleado extends Persona2 {// extends para hacer herencia
    constructor(nombre, apellidos, departamento){
        super(nombre,apellidos)   //clase que te permite acceder a la class Persona2 (padre)
        this._departamento = departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }

    //Sobreescribiendo de la clase Persona2
    nombreCompleto(){
        return super.nombreCompleto() + ' ' + this._departamento;
    }
}
//let personados = new Persona2('Arturo', 'Rojas');
//console.log(personados.nombrecompleto());

let empleado1 = new Empleado('Maria', 'Perez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto()); //imprime nombre completo + Empleado
console.log(empleado1.toString());