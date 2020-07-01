package com.github.firatkucuk.experiment_actions_kotlin_lib

import kotlin.test.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test fun sayHello() {
        val classUnderTest = Hello()
        assertEquals(classUnderTest.sayHello("World"), "Hello World")
    }
}
