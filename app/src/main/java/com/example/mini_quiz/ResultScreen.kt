package com.example.mini_quiz

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun ResultScreen(score: Int, totalQuestions: Int, onRestartQuiz: () -> Unit) {
    val resultText = when {
        score == totalQuestions -> "Parabéns! Pontuação Perfeita!"
        score >= totalQuestions / 2 -> "Bom trabalho!"
        else -> "Tente novamente, você consegue!"
    }

    // Resultado
    Text(
        text = resultText,
        style = MaterialTheme.typography.headlineMedium,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(bottom = 16.dp)
    )

    // Pontuação
    Text(
        text = "Sua Pontuação Final: $score / $totalQuestions",
        style = MaterialTheme.typography.titleLarge,
        modifier = Modifier.padding(bottom = 48.dp)
    )

    // Botão de Reiniciar
    Button(
        onClick = onRestartQuiz,
        modifier = Modifier.fillMaxWidth(0.6f).height(56.dp)
    ) {
        Text("Reiniciar Quiz", style = MaterialTheme.typography.titleMedium)
    }
}