fun main() {
    println("--- Questão 6 ---")

    // Lambda tipada como (Double?) -> Double usando o identificador implícito 'it'
    val calcularGorjeta: (Double?) -> Double = {
        if (it == null || it <= 0.0) {
            0.0
        } else {
            it
        }
    }

    println("Gorjeta informada 15.0: R$ ${calcularGorjeta(15.0)}")
    println("Gorjeta informada null: R$ ${calcularGorjeta(null)}")
    println("Gorjeta informada -5.0: R$ ${calcularGorjeta(-5.0)}")
}