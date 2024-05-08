package com.izeye.helloworld.springbootkotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * [RestController] for testing.
 *
 * @author Johnny Lim
 */
@RestController
@RequestMapping("/test")
class TestController {

    @GetMapping
    fun message(message1: String, message2: String, message3: String): String {
        return "$message1 $message2 $message3"
    }

}
