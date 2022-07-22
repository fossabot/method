package ch.thipok.method

import kotlin.test.Test
import kotlin.test.assertTrue

class CommonGreetingTest {

    @Test
    fun testExample() {
        assertTrue(Greeting().sentence().contains("Hello"), "Check 'Hello' is mentioned")
    }
}