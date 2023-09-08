package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca


fun testaComportamentosConta() {

    val jhonatan = Cliente(nome = "Jhonatan", cpf = "", senha = 1)

    val contaJhonatan = ContaCorrente(jhonatan, 1000)
    contaJhonatan.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)
    println()

    println(contaJhonatan.titular)
    println(contaJhonatan.numero)
    println(contaJhonatan.saldo)

    contaJhonatan.deposita(50.00)
    println("saldo da conta do Jhonatan:")
    println(contaJhonatan.saldo)
    contaFran.deposita(70.00)
    println("saldo da conta da fran:")
    println(contaFran.saldo)
    contaJhonatan.saca(150.0)
    println(contaJhonatan.saldo)

    println("transferência da conta da Fran para conta do Alex")

    if (contaFran.transfere(100.00, contaJhonatan)) {
        println("transferência sucedida")

    } else {
        println("Falha na transferência")
    }
    println(contaFran.saldo)
}