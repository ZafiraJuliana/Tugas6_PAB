package com.example.project.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ListAlt
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector

enum class AppDestination(
    val label: String,
    val icon: ImageVector,
    val title: String
) {
    HOME("Home", Icons.Default.Home, "Dashboard Utama"),
    TASKS("Tugas", Icons.Default.ListAlt, "Daftar Tugas & Project"),
    PROFILE("Profil", Icons.Default.Person, "Profil Saya")
}