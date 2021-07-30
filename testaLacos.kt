fun testaLaco() {
    for (i in 1..7) {
        var a = 10.5
        val b = 15.8

        a = 0.0

        val c = a + b + i
        println("o valor de c($i) = $c")

    }
    for (i in 7 downTo 1) {
        if (i == 4) {
            continue
        }
        var a = 10.5
        val b = 15.8

        a = 0.0

        val c = a + b + i
        println("o valor de c($i) = $c")
    }

    for (i in 1..5) {
        val titular = "Alex $i"
        val numeroConta = 200
        var saldo = 0.0
        saldo = 100 + 2.0
        saldo += 200 + i

        println(titular)
        println(numeroConta)
        println(saldo)


        for (i in 5 downTo 1) {
            val titular = "Alex $i"
            val numeroConta = 200
            var saldo = 0.0
            saldo = 100 + 2.0
            saldo += 200 + i

            println(titular)
            println(numeroConta)
            println(saldo)


        }
        for (i in 5 downTo 1 step 2) {
            val titular = "Alex $i"
            val numeroConta = 200
            var saldo = 0.0
            saldo = 100 + 2.0
            saldo += 200 + i

            println(titular)
            println(numeroConta)
            println(saldo)
        }
        var i = 1
        while (i < 5) {
            val titular = "Alex $i"
            val numeroConta = 200
            var saldo = 0.0
            saldo = 100 + 2.0
            saldo += 200 + i

            println(titular)
            println(numeroConta)
            println(saldo)
            i++
        }

    }
}