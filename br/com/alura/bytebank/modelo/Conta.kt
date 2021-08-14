package br.com.alura.bytebank.modelo


abstract class Conta(
    var titular:Cliente, var numero: Int){
    var salod = 0.0
        protected set


    companion object {
        var total = 0
            private set

    }


    init{
        println("Crinado uma conta")
        total++

    }




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

class ContaCorrente(titular: Cliente, numero: Int)
    : Conta(
    titular,
    numero) {




     override fun saca(valor: Double) {
         val valorComTaxa = valor + 0.10
         if (this.salod >= valorComTaxa){
             this.salod -= valorComTaxa

         }



    }


    }

class ContaPoupanca(titular: Cliente, numero: Int)
    : Conta(titular, numero){


    override fun saca(valor: Double) {
        if(this.salod >= valor){
            this.salod -= valor
        }
    }
}