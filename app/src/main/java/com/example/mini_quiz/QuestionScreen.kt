package com.example.mini_quiz

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun QuestionScreen(
    question: Question,
    questionNumber: Int,
    onAnswerSelected: (isCorrect: Boolean) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Número da Pergunta
        Text(
            text = "Pergunta $questionNumber de $TOTAL_QUESTIONS",
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Texto da Pergunta
        Card(
            modifier = Modifier.fillMaxWidth().padding(bottom = 32.dp),
            elevation = CardDefaults.cardElevation(4.dp)
        ) {
            Text(
                text = question.text,
                style = MaterialTheme.typography.headlineSmall,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(24.dp)
            )
        }

        // Opções de Resposta
        question.options.forEachIndexed { index, option ->
            Button(
                onClick = {
                    val isCorrect = index == question.correctAnswerIndex
                    onAnswerSelected(isCorrect)
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.9f)
                )
            ) {
                Text(option, style = MaterialTheme.typography.bodyLarge)
            }
        }
    }
}