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
fun InitialScreen(onStartQuiz: () -> Unit) {
    Text(
        text = "Bem-vindo ao Mini-Quiz!",
        style = MaterialTheme.typography.headlineLarge,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(bottom = 32.dp)
    )
    Text(
        text = "Teste seus conhecimentos com ${TOTAL_QUESTIONS} perguntas.",
        modifier = Modifier.padding(bottom = 48.dp)
    )
    Button(
        onClick = onStartQuiz,
        modifier = Modifier.fillMaxWidth(0.6f).height(56.dp)
    ) {
        Text("Iniciar Quiz", style = MaterialTheme.typography.titleMedium)
    }
}