package modelo

interface Autenticavel { //interfaces sempre são abstratas, indica-las como abstratas torna o código redundante.

    fun autentica(senha: Int): Boolean
}