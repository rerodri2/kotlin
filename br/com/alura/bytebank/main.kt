import br.com.alura.bytebank.Produto
import br.com.alura.bytebank.modelo.*


fun main() {

    val endereco = Endereco(
        logradouro = "Rua Vergueiro",
        complementos = "Alura",
        cep = "000.000-00"
        )
    val enderecoNovo = Endereco(logradouro = "Rua Vergueiro",
        complementos = "Alura",
        cep = "000.000-00"
    )

    println(endereco.equals(enderecoNovo))

    println(endereco.hashCode())
    println(enderecoNovo.hashCode())

    println(endereco)
    println(enderecoNovo)
    println("${endereco.javaClass}@${Integer.toHexString(endereco.hashCode())}")






}








