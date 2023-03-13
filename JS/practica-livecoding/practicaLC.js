const myArray = ['insecto', 'bootcamp', 'mangos', 'reptil', 'mosca', 'escritorio'];
const palabra = "barco";

function palabrasMasGrandes(array, palabra) {
  let resultado = [];

  for (let i = 0; i < array.length; i++) {
    if (array[i].length > palabra.length) {
      resultado.push(array[i]);
    }
  }

  return resultado;
}

const palabrasGrandes = palabrasMasGrandes(myArray, palabra);
console.log(palabrasGrandes);
