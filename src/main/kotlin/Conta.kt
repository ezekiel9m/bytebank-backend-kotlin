class Conta(var titular: String, var numeroConta: Int, var  tipoConta: String) {

    var saldo = 0.0
        private  set
    var valorDepositado = 0.0
        private  set
    var valorSacado = 0.0
        private  set
    var saldoAnterior = 0.0
        private  set

    fun deposito (valor: Double){
        if (valor > 0){
            this.saldoAnterior = this.saldo
            this.saldo += valor
        }
    }
    fun saque (valor: Double){
        if (saldo >= valor){
            this.saldo -= valor
            this.valorSacado = valor
        }
    }
    fun tranferir(valor: Double, destino: Conta){
        if (this.saldo >= valor){
            this.saldo -= valor
            this.valorDepositado = valor
            destino.deposito(valor)
        }
    }
}