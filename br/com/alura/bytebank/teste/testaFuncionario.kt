import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.Calculadora
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionario() {
    println("Bem-vindo ao Bytebank")
    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")


    if (fran.autentica(1234)) {
        println("autenticação com sucesso")
    } else {
        println("erro ao autenticar")
    }

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plf = 200.0
    )

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plf:  ${gui.plf}")


    if (gui.autentica(4000)) {
        println("autenticação com sucesso")
    } else {
        println("erro ao autenticar")
    }

    val cal = Calculadora()
    cal.calculadoraBonificaco(alex)
    cal.calculadoraBonificaco(fran)
    cal.calculadoraBonificaco(gui)
    cal.calculadoraBonificaco(maria)

    println("bonificação total é ${cal.total}")
}
