package br.com.alura.bytebank.modelo

abstract class Conta(
    var titular:Cliente, var numero: Int){
    var salod = 0.0
        protected set




   open fun deposita(valor: Double){
        if (valor >= 0){
            this.salod += valor

        }

    }

    abstract fun saca(valor:Double)

    fun transfere(valor:Double, destino: Conta):Boolean{
        if (this.salod >= valor){
            this.salod -= valor
            destino.deposita(valor)
            return true
        }
        else{
            return false
        }
    }

}