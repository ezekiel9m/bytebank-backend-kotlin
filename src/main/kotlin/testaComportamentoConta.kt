fun testaComportamentoConta() {
    val listaContas: MutableList<Conta> = mutableListOf()
    val listaFuncionario: MutableList<Funcionario> = mutableListOf()
    val listaGerente: MutableList<Gerente> = mutableListOf()

    val gerente = Gerente("Erneto Muxito", "000.000.000-33", 5000.0, 123)
    var conta = Conta(titular = gerente.nome, numeroConta = 12346009, tipoConta = "Conta Correte")
    conta.deposito(gerente.salario + gerente.bonificacao())
    listaGerente.add(gerente)
    listaContas.add(conta)

    var funcionario = Funcionario("Ezekiel Muxito", "000.000.000-00", 1000.0)
    funcionario.bono = funcionario.bonificacao()
    conta = Conta(titular = funcionario.nome, numeroConta = 1234678, tipoConta = "Conta Correte")
    conta.deposito(funcionario.salario + funcionario.bonificacao())
    listaFuncionario.add(funcionario)
    listaContas.add(conta)


    funcionario = Funcionario(nome = "Elzia Muxito", cpf = "000.000.000-11", salario = 1200.0)
    funcionario.bono = funcionario.bonificacao()
    conta = Conta(funcionario.nome, 890645, "Conta Poupança")
    conta.deposito(funcionario.salario + funcionario.bonificacao())
    listaFuncionario.add(funcionario)
    listaContas.add(conta)

    funcionario = Funcionario("Helda Muxito", "000.000.000-22", 900.0)
    funcionario.bono = funcionario.bonificacao()
    conta = Conta(funcionario.nome, 8906498, "Conta Corrente")
    conta.deposito(funcionario.salario + funcionario.bonificacao())
    conta.saque(10.0)
    listaFuncionario.add(funcionario)
    listaContas.add(conta)

    conta.tranferir(5990.0, listaContas[1])
    imprimirConta(listaContas, listaFuncionario, listaGerente)
}