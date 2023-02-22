//Clasificación abstracta-
class OperacionesAritmeticas {
    //constructor
    numero0 = 10 //dentro de la clase se encuentran las caracteristicas atributos o metodos para definir el objeto
    numero1 = 0;
    constructor(valor0, valor1) {
        this.numero0 = valor0;
        this.numero1 = valor1;
    }

    sumar() {
        return this.numero0 + this.numero1; // S. resposabilidad unica y bien definida
    }
}

let obj4 = new OperacionesAritmeticas(9, 6);
console.log("--> " + obj4.sumar());

let obj3 = new OperacionesAritmeticas();
obj3.numero0 = 8;
obj3.numero1 = 5;

console.log(obj3.sumar(obj3.numero0, obj3.numero1))

let obj2 = new OperacionesAritmeticas();
console.log(obj2.sumar(10, 20));//Llamada del objeto


let obj1;  //Declaracion del objeto
obj1 = new OperacionesAritmeticas();//Creacion del objeto
console.log(obj1.numero0);//Llamada del objeto