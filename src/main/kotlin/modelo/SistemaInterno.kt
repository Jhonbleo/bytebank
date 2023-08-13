package modelo

import modelo.Autenticavel
import modelo.Diretor

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }

    }

    fun entra(diretor: Diretor) {

    }
}