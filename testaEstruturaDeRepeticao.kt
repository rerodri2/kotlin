fun estruturaRepeticao(saldo:Double){

    when {
        saldo > 0.0 -> println("saldo é positivo")

        saldo == 0.0 -> println("Sem saldo na conta")

        else -> println("saldo é negativo")


    }



}