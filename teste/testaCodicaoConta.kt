import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaCondicaoConta() {
    val contaAlex = ContaCorrente(titular = "Alex", numero = 1000)
    contaAlex.deposita(200.0)

    val contaFran = ContaPoupanca(numero = 1001, titular = "Fran")
    contaFran.deposita(300.0)
    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.salod)

    println(contaAlex.salod)
    println(contaAlex.numero)
    println(contaAlex.salod)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.salod)
    println("depositando na conta do Alex")
    contaFran.deposita(70.0)
    println(contaFran.salod)
    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.salod)
    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.salod)

    println("saque em excesso na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.salod)

    println("saque em excesso na conta da Alex")
    contaAlex.saca(250.0)
    println(contaAlex.salod)

    println("Transferência da conta da Fran para a conta do Alex")
    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha ao transferir")
    }

    println(contaAlex.salod)
    println(contaFran.salod)
}