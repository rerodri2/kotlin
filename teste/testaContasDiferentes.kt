import modelo.ContaCorrente
import modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("saldo conta corrente após deposito ${contaCorrente.salod}")
    println("saldo conta poupança após deposito ${contaPoupanca.salod}")
    contaCorrente.saca(100.0)
    contaPoupanca.saca(50.0)
    println("saldo conta corrente após saque ${contaCorrente.salod}")
    println("saldo conta poupança após saque ${contaPoupanca.salod}")
    contaCorrente.transfere(50.0, contaPoupanca)
    contaPoupanca.transfere(100.0, contaCorrente)
    println("saldo conta corrente após transferencia ${contaCorrente.salod}")
    println("saldo conta poupança após transferencia ${contaPoupanca.salod}")
}
