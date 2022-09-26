package com.example

import io.micronaut.core.annotation.Introspected
import io.swagger.v3.oas.annotations.media.Schema

@Introspected
data class DemoData(
    @field:Schema(defaultValue = "myDefault")
    val name: String,
)