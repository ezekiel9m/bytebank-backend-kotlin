fun imprimirConta(
    conta: MutableList<Conta>,
    funcionario: MutableList<Funcionario>,
    gerente: MutableList<Gerente>
){

    var i = 0
    gerente.forEach{
        funcionario.add(Funcionario(
            nome = it.nome,
            cpf =  it.cpf,
            salario = it.salario,
            bono =  it.bonificacao()
        ))
        if (it.autenticar(it.senha)) {
            println("autorizado")
        }
        else
            println("login não autorizado")
    }
    conta.forEach{
        imprimir(it = it, funcionario[i])
        i++
    }
}

    /*
    conta.forEach{
        println()
        println("------ Dados banários ----")
        println("Tipo da Conta: ${it.tipoConta}")
        println("Titular: ${it.titular}")
        println("Número da conta: ${it.numeroConta}")

        validarSaldo(it.saldo)
    }
    println()
    for (i in 1..conta.size){

        println()
        println("------ Dados banários ----")
        println("Titular: $conta.")
        println("Número da conta: $numeroConta")

        testarCondicoes(saldo)
    }

     */

