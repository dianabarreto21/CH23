//prueba efectiva
//const indexTest = require ("../calculadora"); ecma 5 hace los mismo que import

import { indexTest } from "../calculadora"; //ecma 6

test ('test suma', () => {
    const r = indexTest.suma(1,2);
    expect(r).toBe(3); //se utiliza cada vez que desea testear un valor. Rara vez se utiliza expect por sí mismo. En su lugar, utilizarás expect junto a una función de "comparación" para afirmar algo sobre un valor.
    
})
test.todo('test resta'); //todo son tareas programadas
test.todo('test multi');
test.todo('test divide');