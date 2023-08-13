package teste

import modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaCorrente("Maria", 1003)
    contaMaria.titular = "Maria"
    contaJoao.titular = "João"

    println(contaJoao)
    println(contaMaria)
}
