package com.uglyeagle;

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext

// Point explicitly to your Kotlin main class to avoid the "Multiple Config" error
@SpringBootTest(classes = [KotlinMain::class])
class KotlinTest {

    @Autowired
    private lateinit var applicationContext: ApplicationContext

    @Test
    fun contextLoads() {
        // In Kotlin, assertThat is imported from org.assertj.core.api.Assertions
        assertThat(applicationContext).isNotNull
    }
}