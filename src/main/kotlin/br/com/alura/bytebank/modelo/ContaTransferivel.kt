package br.com.alura.bytebank.modelo

abstract class ContaTransferivel(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }
}