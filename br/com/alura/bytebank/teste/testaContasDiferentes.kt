import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1,
            endereco = Endereco(logradouro = "Rua Vergueiro"
            )

        ),
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = Cliente(
            nome = "Fran",
            cpf = "",
            senha = 2
        ),
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

    println("titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome} ")
    println("cpf do titular ${contaCorrente.titular.cpf} ")
    println("endereco titular ${contaCorrente.titular.endereco}")

}
