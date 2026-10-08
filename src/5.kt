fun avaliarMotorista(nota: Int?) {
    // Converte nota nula para 0 usando o operador Elvis
    val notaFinal = nota ?: 0

    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
        else -> println("Nota fora do padrão.")
    }
}

fun main() {
    println("--- Questão 5 ---")
    avaliarMotorista(5)
    avaliarMotorista(4)
    avaliarMotorista(2)
    avaliarMotorista(null)
}