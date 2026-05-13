package com.firstmaker.meme

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform