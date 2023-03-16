function controlIf (numeroIf) {
    if (numeroIf > 0) {
        return "Es positivo";
    }else if (numeroIf < 0){
        return "Es negativo";
    }else{
        return "Es cero"
    }
}

while (numeroWhile < 3){
    console.log("El número es: " + numeroWhile);
    numeroWhile++;
}

do {
    console.log("El número es: " + numeroWhile);
    numeroWhile++;
}while (numeroWhile < 3);

let numeroFor = 0;
for (numeroFor == 0; numeroFor <= 3; numeroFor++){
    console.log("El número es: " + numeroFor)
}

let estacion = "Verano";
switch (estacion){
    case "Verano":
        console.log("La estación es Verano!!");
        break;
    case "Invierno":
        console.log("La estación es Invierno!!");
        break;
    case "Otoño":
        console.log("La estación es Otoño!!");
        break;
    case "Primavera":
        console.log("La estación es Primavera!!");
        break;
    default:
        console.log("No es ninguna estación");
}