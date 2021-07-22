package com.cuarencoders.abmus_api.integration

import assertk.assertThat
import assertk.assertions.isEqualTo
import io.restassured.http.ContentType
import io.restassured.http.ContentType.*
import io.restassured.module.mockmvc.RestAssuredMockMvc.`when`
import org.junit.jupiter.api.Test
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus.*

class PingIntegrationTest : BaseIntegrationTest() {
    @Test
    fun pingTest() {
        // GIVEN
        val expectedResponse = "pong"

        // WHEN
        val actualResponse = `when`()
            .get("/ping")
            .then()
            .assertThat()
            .status(OK)
            .and()
            .contentType(TEXT)
            .and()
            .extract()
            .asString()

        // THEN
        assertThat(actualResponse).isEqualTo(expectedResponse)
    }
}
