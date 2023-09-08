package teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(nome = "Alex", cpf = "111.111.111-11", senha = 1),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(nome = "Fran", cpf = "222.222.222-22", senha = 2),
        numero =1001
    )
    val contaSalario = ContaSalario(
        titular = Cliente(nome = "Gui", cpf = "333.333.333-33", senha = 3),
        numero = 1002
    )

    println("Titular")
    println("Nome do Titular ${contaCorrente.titular.nome}")
    println("Cpf do Titular ${contaCorrente.titular.cpf}")

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    contaSalario.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")
    println("saldo salário: ${contaSalario.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)
    contaSalario.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")
    println("saldo após saque salário: ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)


    println("saldo poupança após transferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")

    contaCorrente.transfere(100.0, contaSalario)

    println("saldo corrente após transferir para salário: ${contaCorrente.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

    contaPoupanca.transfere(200.0, contaSalario)

    println("saldo poupança após transferir para salário: ${contaPoupanca.saldo}")
    println("saldo salário após receber transferência: ${contaSalario.saldo}")

//    contaSalario.transfere(200.0, contaCorrente)
//    contaSalario.transfere(200.0, contaPoupanca)
    }