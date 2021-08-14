package br.com.alura.bytebank

class Produto(
    private val nome: String,
    private val valor: Double
) {

    val taxaAdicional = 0.1
    val preco: Double get() =  valor + (valor * taxaAdicional)
}