import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCopiaEReferencia(){
    val numeroX = 10
    var numeroY = numeroX
    numeroY++
    println("númeroX $numeroX")
    println("númeroY $numeroY")

    val contaJoao = ContaPoupanca("João", 1002)
    var contaMaria = ContaCorrente("Maria", 1003)
//    contaMaria = contaJoao

//    contaJoao.titular = "João"
//    contaMaria.titular = "Maria"


    println(contaJoao)
    println(contaMaria)


}