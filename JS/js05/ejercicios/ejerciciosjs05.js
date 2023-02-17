//Exercise 1
//part1
let names = ["Maria", "Antony", "Joy", "Juan"];
names.push("Diana");
console.log(names);

//part2
function nameFound(names, nameToFind) {
    return names.includes(nameToFind);
}
let findName = nameFound(names, "Joy");
console.log(findName);

//part3
let names2 = ["Valeria", "Mar", "Carlos", "Beto"]
let allNamesList = allNames(names, names2);
function allNames(names, names2) {
    return names.concat(names2);
}
console.log(allNamesList);

//part4
function nameLengths(names) {
    let lengths = [];
    for (let i = 0; i < names.length; i++) {
        lengths.push(names[i].length);
    }
    return lengths;
}
let lengths = nameLengths(allNamesList);
console.log(lengths);

//Exercise 2

What do the following expressions evaluate to?

false || (true && false); false
true || (11 + 12); true
(31 + 22) || true; true
true && (1 + 7); false
false && (3 + 4); false
(1 + 2) && true; false
(32 * 4) >= 129; true
false !== !true; false
true === 4; false
false === (847 === '847'); false
false === (887 == '887'); false
(!true || (!(100 / 5) === 20) || ((328 / 4) === 82)) || false; true

//Exercise 3

function rangoNum (num){
    if(num >= 0 && num <= 25) {
        console.log("tu numero está entre 0 y 25");
    } else if(num >= 26 && num <= 100){
        console.log("tu numero está entre 26 y 100");
    }else if(num >=101){
        console.log("tu numero es mayor a 100");
    }else if (num < 0){
        console.log("tu numero es menor a 0");
    }

}
rangoNum(-6);