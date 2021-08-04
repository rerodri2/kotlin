package br.com.alura.bytebank.modelo

class Calculadora {

    var total:Double = 0.0

    fun calculadoraBonificaco(funcionario: Funcionario){
        this.total +=  funcionario.bonificacao
    }




}