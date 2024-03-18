package br.com.fiap.calculadoraimc

import kotlin.math.pow

fun calcularImc(pesoUsuario: Double, alturaUsuario: Double): Double{
    var imc = pesoUsuario / (alturaUsuario/100).pow(2)
    return imc
}

fun obterStatusImc(imcUsuario: Double): String{
    return if (imcUsuario < 18.5){
        "Abaixo do peso"
    } else if (imcUsuario >= 18.5 && imcUsuario < 25){
        "Peso Ideal"
    } else if (imcUsuario >= 25 && imcUsuario < 30){
        "Levemente acima do peso"
    } else if(imcUsuario >= 30 &&  imcUsuario < 35){
        "Obesidade Grau I"
    } else if (imcUsuario >=35 && imcUsuario < 40){
        "Obesidade Grau II"
    } else {
        "Obesidade Grau III"
    }
}