package com.cuarencoders.abmus_api.integration

import io.mockk.junit5.MockKExtension
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import org.springframework.web.context.WebApplicationContext

@SpringBootTest
@ContextConfiguration
@TestInstance(PER_CLASS)
@ExtendWith(MockKExtension::class)
abstract class BaseIntegrationTest {
    @Autowired
    private lateinit var webApplicationContext: WebApplicationContext

    @BeforeAll
    fun setUp() {
        RestAssuredMockMvc.webAppContextSetup(webApplicationContext)
    }
}
