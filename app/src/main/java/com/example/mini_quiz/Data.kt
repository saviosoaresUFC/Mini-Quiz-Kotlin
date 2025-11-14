package com.example.mini_quiz

data class Question(
    val text: String,
    val options: List<String>,
    val correctAnswerIndex: Int // index da resposta certa
)

val quizQuestions = listOf(
    Question(
        "Qual montanha é o ponto mais alto do planeta Terra?",
        listOf("K2", "Monte Everest", "Monte McKinley", "Monte Fuji"),
        1 // Monte Everest
    ),
    Question(
        "Qual o nome do recurso do Kotlin que lida com programação assíncrona e concorrente de forma estruturada?",
        listOf("Threads", "AsyncTasks", "Coroutines", "RxJava"),
        2 // Coroutines
    ),
    Question(
        "O que significa a sigla 'HTML'?",
        listOf("Hyper Text Markup Language", "High Tech Modern Language", "Home Tool Markup Logic", "Hyperlink Text Management Link"),
        0 // Hyper Text Markup Language
    ),
    Question(
        "Qual planeta do nosso sistema solar é conhecido como 'Gigante Gasoso'?",
        listOf("Marte", "Vênus", "Júpiter", "Netuno"),
        2 // Júpiter
    ),
    Question(
        "Qual a função principal onde a execução de um programa Kotlin começa?",
        listOf("start()", "init()", "run()", "main()"),
        3 // main()
    ),
    Question(
        "Em Kotlin, qual palavra-chave é usada para herança de classes?",
        listOf("extends", "inherits", "open", "public"),
        2 // open
    ),
    Question(
        "Qual das seguintes coleções garante que os elementos não são duplicados?",
        listOf("List", "Array", "Map", "Set"),
        3 // Set
    )
)

val TOTAL_QUESTIONS = quizQuestions.size