// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { Easy, Mediun, Hard }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 20)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val nivel = Nivel.Hard
    val usuario = "Roberto"
    ConteudoEducacional("Kotlin")
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
//Devido a minha dificuldade inicial ainda estou entendedo o conteudo e não consegui evoluir
