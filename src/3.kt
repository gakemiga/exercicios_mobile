fun validarBioInfantil(bio: String?) {
    // ?.length faz a chamada segura; se for null, ?: 0 atribui tamanho 0
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita (Tamanho: $tamanho caracteres)")
    } else {
        println("Bio muito longa (Tamanho: $tamanho caracteres)")
    }
}

fun main() {
    println("--- Questão 3 ---")
    validarBioInfantil("Gosto de desenhos e super-heróis!") // Válida (< 50)
    validarBioInfantil(null) // Válida (0 <= 50)
    validarBioInfantil("Esta biografia infantil é intencionalmente muito extensa para testar se a regra de validação de até cinquenta caracteres do app funciona de verdade.") // > 50
}