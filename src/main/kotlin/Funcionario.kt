 class Funcionario (
     val nome: String = "",
     val cpf: String = "",
     var salario: Double = 0.0,
     var bono: Double = 0.0
){
     fun  bonificacao(): Double {
         return salario * 0.1
     }
}
