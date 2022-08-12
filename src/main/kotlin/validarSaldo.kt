fun validarSaldo(saldo: Double){
    when {
        saldo > 0.0 -> println("Saldo da conta: $saldo")
        saldo == 0.0 -> println("Saldo da conta é neutro")
        else ->  println("Saldo negativo: $saldo")
    }
}