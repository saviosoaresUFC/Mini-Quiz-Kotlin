package com.example.mini_quiz

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable

@Composable
fun QuizScreen() {

    // -1 é a tela inicial
    // 0 a 4 são as perguntas
    // 5 é o resultado
    var currentQuestionIndex by remember { mutableStateOf(-1) }
    var score by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        when (currentQuestionIndex) {
            -1 -> InitialScreen(onStartQuiz = {
                currentQuestionIndex = 0
                score = 0
            })
            in 0 until TOTAL_QUESTIONS -> QuestionScreen(
                question = quizQuestions[currentQuestionIndex],
                questionNumber = currentQuestionIndex + 1,
                onAnswerSelected = { isCorrect ->
                    if (isCorrect) {
                        score++
                    }
                    // avança para a próxima pergunta
                    currentQuestionIndex++
                }
            )
            else -> ResultScreen(
                score = score,
                totalQuestions = TOTAL_QUESTIONS,
                onRestartQuiz = {
                    currentQuestionIndex = -1
                }
            )
        }
    }
}