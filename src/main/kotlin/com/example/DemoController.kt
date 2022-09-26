package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get


@Controller
class DemoController {

    @Get("testRest")
    fun testParallelDbInvocation(demoInput: DemoData) {
    }
}

