package com.SeanMassie.KotlinApi

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMethod


@FeignClient(name = "GzipLocal")
interface GzipLocalClient {
    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/")
    fun posts(): GzipResponse
}