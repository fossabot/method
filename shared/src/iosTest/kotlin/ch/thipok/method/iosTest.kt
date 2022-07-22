package ch.thipok.method

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().sentence().contains("iOS"), "Check iOS is mentioned")
    }
}