package modelo

import modelo.Conta

class ContaPoupanca(titular: String, numero: Int)
    : Conta(titular, numero){

    override fun saca(valor: Double) {
        if(this.salod >= valor){
            this.salod -= valor
        }
    }
}