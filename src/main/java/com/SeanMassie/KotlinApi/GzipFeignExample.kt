package com.SeanMassie.KotlinApi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableFeignClients
class GzipFeignExample

fun main(args : Array<String>){SpringApplication.run(GzipFeignExample::class.java)}


@RestController
class DemoController(val gzipLocalClient: GzipLocalClient) {

    @GetMapping("/")
    fun posts(): GzipResponse {
        return gzipLocalClient.posts()
    }
}

data class GzipResponse(var name: String = "Sean",
                        var age: Int = 26)