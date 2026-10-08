fun limparBaseUsuarios(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        val tamanho = email?.length ?: 0

        // Condição: se for nulo OU se o tamanho for 0 (string vazia "")
        if (email == null || tamanho == 0) {
            contasInvalidas++
            println("Aviso: Conta inválida encontrada ($email). Marcada para deleção.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Total de contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    println("--- Questão 7 ---")
    val listaEmails = listOf("dev@empresa.com", null, "admin@provedor.com", "", "suporte@servico.com", "")
    limparBaseUsuarios(listaEmails)
}