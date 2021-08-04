import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca

fun testaCopiaEReferencia(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("númeroX $numeroX")
    println("númeroY $numeroY")

    val joao = Cliente(nome = "João", cpf ="", senha = 1)

    val contaJoao = ContaPoupanca(joao, 1002)
    var contaMaria = ContaCorrente(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 2
    ), 1003)

    contaJoao.titular.nome = "João"
    contaMaria.titular.nome = "Maria"



    println("titula conta joão ${contaJoao.titular}")
    println("titula conta joão ${contaMaria.titular}")


}