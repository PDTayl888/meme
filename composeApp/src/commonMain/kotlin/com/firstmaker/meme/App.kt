package com.firstmaker.meme

import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.firstmaker.meme.core.theme.MemeCreatorTheme
import com.firstmaker.meme.meme_gallery.presentation.MemeGalleryScreen

@Composable
@Preview
fun App() {
    MemeCreatorTheme {
        MemeGalleryScreen(
            onMemeTemplateSelected = {

            }
        )
    }
}