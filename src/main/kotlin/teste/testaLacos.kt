package teste

fun testaLacos() {
    for (i in 5 downTo 1) {
        val titular: String = "Jhonatan $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("titular: $titular")
        println("número da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
    }
}