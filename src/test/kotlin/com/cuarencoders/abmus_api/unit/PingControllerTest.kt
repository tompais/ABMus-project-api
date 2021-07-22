package com.cuarencoders.abmus_api.unit

import assertk.assertThat
import assertk.assertions.isEqualTo
import com.cuarencoders.abmus_api.controllers.PingController
import io.mockk.junit5.MockKExtension
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(MockKExtension::class)
class PingControllerTest {
    private val pingController = PingController()

    @Test
    fun pingTest() {
        // GIVEN
        val expectedResponse = "pong"

        // WHEN
        val actualResponse = pingController.ping()

        // THEN
        assertThat(actualResponse).isEqualTo(expectedResponse)
    }
}
