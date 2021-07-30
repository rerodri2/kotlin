class ContaCorrente(titular: String, numero: Int)
    : Conta(titular, numero) {


     override fun saca(valor: Double) {
         val valorComTaxa = valor + 0.10
         if (this.salod >= valorComTaxa){
             this.salod -= valorComTaxa

         }



    }


    }