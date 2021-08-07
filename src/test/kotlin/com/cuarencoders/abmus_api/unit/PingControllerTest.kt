package com.cuarencoders.abmus_api.unit

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.cuarencoders.abmus_api.controllers.PingController
import com.cuarencoders.abmus_api.services.interfaces.IPingService
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.impl.annotations.MockK
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class PingControllerTest {
    @MockK
    private lateinit var pingService: IPingService

    @InjectMockKs
    private lateinit var pingController: PingController

    @Test
    fun pingTest() {
        // GIVEN
        val expectedResponse = "pong"
        every { pingService.ping() } returns expectedResponse

        // WHEN
        val actualResponse = pingController.ping()

        // THEN
        assertThat(actualResponse).isEqualTo(expectedResponse)
    }
}
