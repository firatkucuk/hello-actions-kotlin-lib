package com.github.firatkucuk.hello_actions_kotlin_lib

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test fun sayHelloMethodReturnsHello() {
        val classUnderTest = Hello()
        assertEquals("Hello World", classUnderTest.sayHello("World"), "sayHello method should return 'Hello World'")
    }
}
