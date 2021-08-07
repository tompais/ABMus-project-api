package com.cuarencoders.abmus_api.services.implementations

import com.cuarencoders.abmus_api.services.interfaces.IPingService
import org.springframework.stereotype.Service

@Service
class PingService : IPingService {
    override fun ping(): String = "pong"
}
