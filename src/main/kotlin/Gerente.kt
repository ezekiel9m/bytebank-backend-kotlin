class Gerente(
    val nome: String = "",
    val cpf: String = "",
    var salario: Double = 0.0,
    val senha: Int
) {
    fun  bonificacao(): Double {
        return salario * 0.3
    }
    fun  autenticar(senha: Int): Boolean {
        if (this.senha == senha)
            return true
        return false
    }
}