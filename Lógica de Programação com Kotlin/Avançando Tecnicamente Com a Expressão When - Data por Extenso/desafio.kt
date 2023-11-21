fun main() {
  val entrada: String? = readLine()
  
  // Utiliza o conceito de "destructuring" para atribuir cada parte da data (dia/mes/ano).
  // Referência: https://kotlinlang.org/docs/destructuring-declarations.html
  val (dia, mes, ano) = entrada!!.split("/")
  
  val meses = listOf(
        "Janeiro", "Fevereiro", "Marco", "Abril",
        "Maio", "Junho", "Julho", "Agosto",
        "Setembro", "Outubro", "Novembro", "Dezembro"
    )
  
  val mesPorExtenso = when (mes.toIntOrNull()) {
      in 1..12 -> meses[mes.toInt() - 1]
      else -> "Mes Invalido!"
  }
  
  println("$dia de $mesPorExtenso de $ano")
}