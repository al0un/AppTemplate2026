package com.ifpr.androidapptemplate.baseclasses

data class Item(
    var marca: String? = null,
    var tamanho: String? = null,
    var material: String? = null,
    val base64Image: String? = null,
    val imageUrl: String? = null
)
