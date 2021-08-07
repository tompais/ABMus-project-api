package com.cuarencoders.abmus_api.controllers

import com.cuarencoders.abmus_api.services.interfaces.IPingService
import org.springframework.http.MediaType.TEXT_PLAIN_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingController(
    private val pingService: IPingService
) {
    @GetMapping("/ping", produces = [TEXT_PLAIN_VALUE])
    fun ping(): String = pingService.ping()
}
