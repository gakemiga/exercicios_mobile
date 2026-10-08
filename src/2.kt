fun auditarEntregas(enderecos: List<String?>) {
    for (item in enderecos) {
        // Substitui nulos por "Endereço Desconhecido" usando o Elvis Operator (?:)
        val enderecoFinal = item ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }
}

fun main() {
    println("--- Questão 2 ---")
    val listaEntregas = listOf("Av. Paulista, 1000", null, "Rua das Flores, 45", null, "Av. Brasil, 500")
    auditarEntregas(listaEntregas)
}