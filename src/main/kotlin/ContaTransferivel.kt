abstract class ContaTransferivel(
    titular: String,
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