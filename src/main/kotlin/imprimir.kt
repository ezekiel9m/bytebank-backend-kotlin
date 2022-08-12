fun  imprimir(it: Conta, funcionario: Funcionario) {
    println()
    println("------ Dados banários ----")
    println("Tipo da Conta: ${it.tipoConta}")
    println("Titular: ${it.titular}")
    println("Número da conta: ${it.numeroConta}")
    println("Cpf: ${funcionario.cpf }")
    println("Saldo anterior: ${it.saldoAnterior}")
    println("Valor de deposito: ${it.valorDepositado}")
    println("Valor sacado: ${it.valorSacado}")
    println("Bono: ${funcionario.bono}")
    validarSaldo(it.saldo)
}