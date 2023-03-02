function factorial(){
    var num = parseFloat(document.querySelector('#fac').value);

    if (num > 0 && num < 11) { 
    return num * (num - 1);
} else { alert("El numero debe ser entre 1 and 10");

} 
    
    document.querySelector('#result') = factorial();
}


    

    

