package hmos9c.belajarandroiddasar

import org.junit.Assert
import org.junit.Test

class HelloTest {

    @Test
    fun testSayHello(){
        val result = Hello.sayHello("Sanas")

        Assert.assertEquals("Hello Sanas", result)
    }
}