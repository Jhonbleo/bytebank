package teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val joao = Cliente(nome = "João", cpf = "", senha = 1)

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"

    val maria = Cliente(nome = "Maria", cpf = "", senha = 2)

    var contaMaria = ContaCorrente(maria, 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println(contaJoao)
    println(contaMaria)
}
