fun calcularDesconto(valor: Double, cupom: String?): Double {
    return when (cupom) {
        "PROMO10" -> valor - 10.0
        "PROMO20" -> valor - 20.0
        else -> valor // Cobre tanto null quanto qualquer outro texto digitado
    }
}

fun main() {
    println("--- Questão 1 ---")
    val preco = 100.0

    println("Cupom PROMO10: R$ ${calcularDesconto(preco, "PROMO10")}") // 90.0
    println("Cupom PROMO20: R$ ${calcularDesconto(preco, "PROMO20")}") // 80.0
    println("Cupom Nulo: R$ ${calcularDesconto(preco, null)}")          // 100.0
    println("Cupom Inválido: R$ ${calcularDesconto(preco, "NATAL50")}")  // 100.0
}