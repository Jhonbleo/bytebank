abstract class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0

    fun deposita(valor: Double) {
        if (valor > 0) {

            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

}