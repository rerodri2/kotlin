package br.com.alura.bytebank.modelo

class ContaPoupanca(titular: Cliente, numero: Int)
    : Conta(titular, numero){

    override fun saca(valor: Double) {
        if(this.salod >= valor){
            this.salod -= valor
        }
    }
}